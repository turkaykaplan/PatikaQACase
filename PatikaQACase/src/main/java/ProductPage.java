import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    By addCartLocator = By.id("addToCartBtn");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {
        click(addCartLocator);
    }

    public void checkProduct(){

        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Hipp Organik 5 Tahıllı Kaşık Maması 200 gr - ebebek";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        System.out.println(ActualTitle + ExpectedTitle);
        System.out.println("Aynı ürün seçildiği doğrulandı.\"");
    }
}
