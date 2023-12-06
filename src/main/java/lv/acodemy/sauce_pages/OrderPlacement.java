package lv.acodemy.sauce_pages;

import lombok.Getter;
import lv.acodemy.utils.LocalDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.How.*;

public class OrderPlacement {
    public OrderPlacement() {
        WebDriver driver = LocalDriverManager.getInstance();
        PageFactory.initElements(driver, this);
    }

    @FindBy (how = XPATH, xpath = "//*[@id='checkout']")
    WebElement checkoutButton;
    @FindBy (how = NAME, name = "firstName")
    WebElement firstNameField;
    @FindBy (how = ID, id = "last-name")
    WebElement lastNameField;
    @FindBy (how = XPATH, xpath = "//input[@data-test='postalCode']")
    WebElement zipCodeField;
    @FindBy (how = ID, id = "continue")
    WebElement continueButton;
    @FindBy (how = NAME, name = "finish")
    WebElement finishButton;
    @Getter
    @FindBy (how = XPATH, xpath = "//div[@id='checkout_complete_container']")
    WebElement checkoutCompleteMessage;

    public static final String ORDER_COMPLETE_MESSAGE = "Thank you for your order!\n" +
            "Your order has been dispatched, and will arrive just as fast as the pony can get there!\n" +
            "Back Home";

    public void placeAnOrder (String firstName, String lastName, String zip) {
        checkoutButton.click();
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        zipCodeField.sendKeys(zip);
        continueButton.click();
        finishButton.click();
    }
}
