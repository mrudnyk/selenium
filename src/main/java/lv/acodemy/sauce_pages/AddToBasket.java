package lv.acodemy.sauce_pages;

import lombok.Getter;
import lv.acodemy.utils.LocalDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.How.CLASS_NAME;
import static org.openqa.selenium.support.How.ID;

public class AddToBasket {

    public AddToBasket() {
        WebDriver driver = LocalDriverManager.getInstance();
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = ID, id = "add-to-cart-sauce-labs-backpack")
    WebElement addToBasket;

    @FindBy(how = CLASS_NAME, className = "shopping_cart_link")
    WebElement cartIcon;

    @Getter
    @FindBy(how = ID, id = "item_4_title_link")
    WebElement cartItem;

    public static final String PRODUCT_TITLE = "Sauce Labs Backpack";

    public void AddBackpackToBasket() {
        addToBasket.click();
        cartIcon.click();
    }
}
