import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    By showCartButton = By.id("btnShowCart");
    By finishButton = By.id("btnGoToShippingAddress");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void clickCart() {

        click(showCartButton);
    }

    public void finishShopping() {

        click(finishButton);
    }

}
