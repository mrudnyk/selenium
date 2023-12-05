import lv.acodemy.sauce_pages.AddToBasket;
import lv.acodemy.sauce_pages.InventoryPage;
import lv.acodemy.sauce_pages.LoginPage;
import lv.acodemy.utils.LocalDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static lv.acodemy.sauce_pages.AddToBasket.PRODUCT_TITLE;
import static lv.acodemy.utils.ConfigurationProperties.getConfiguration;
import static lv.acodemy.utils.LocalDriverManager.closeDriver;
import static lv.acodemy.utils.constants.ErrorMessage.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class SauceDemoTest {
    WebDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;
    Wait<WebDriver> wait;
    AddToBasket addToBasket;

    @BeforeMethod
    public void before() {
        driver = LocalDriverManager.getInstance();
        loginPage = new LoginPage();
        inventoryPage = new InventoryPage();
        addToBasket = new AddToBasket();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Test(description = "Test successful login")
    public void testLogin() {
        driver.get(getConfiguration().getString("sauce.demo.url"));
        loginPage.authorize("standard_user", "secret_sauce");
        wait.until(visibilityOfAllElements(inventoryPage.getInventoryItems()));
        assertThat(inventoryPage.getInventoryItems()).hasSize(6);
    }

    @Test(description = "Test authorization incorrect password")
    public void testLoginIncorrectCredentials() {
        driver.get(getConfiguration().getString("sauce.demo.url"));
        loginPage.authorize("standard_user", "incorrect_password");
        assertThat(loginPage.getErrorMessage().getText()).isEqualTo(USER_AND_PASSWORD_DO_NOT_MATCH);
    }

    @Test(description = "Test authorization no login and password")
    public void testLoginNoCredentials() {
        driver.get(getConfiguration().getString("sauce.demo.url"));
        loginPage.authorize("", "");
        assertThat(loginPage.getErrorMessage().getText()).isEqualTo(USER_NAME_IS_REQUIRED);
    }

    @Test(description = "Test authorization login with empty password")
    public void testLoginNoPassword() {
        driver.get(getConfiguration().getString("sauce.demo.url"));
        loginPage.authorize("standard_user", "");
        assertThat(loginPage.getErrorMessage().getText()).isEqualTo(PASSWORD_IS_REQUIRED);
    }

    @Test(description = "Test add to basket 1 item")
    public void testAddToBasket() {
        driver.get(getConfiguration().getString("sauce.demo.url"));
        loginPage.authorize("standard_user", "secret_sauce");
        addToBasket.AddBackpackToBasket();
        wait.until(visibilityOf(addToBasket.getCartItem()));
        assertThat(addToBasket.getCartItem().getText()).isEqualTo(PRODUCT_TITLE);
    }



    @AfterMethod
    public void after() {
        closeDriver();
    }

}
