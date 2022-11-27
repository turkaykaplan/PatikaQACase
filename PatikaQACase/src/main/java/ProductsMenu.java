import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsMenu extends BasePage  {

    public ProductsMenu(WebDriver driver) throws InterruptedException {

        super(driver);


    }


    public void selectProduct(int i) throws InterruptedException {

        Thread.sleep(3000);
        List <WebElement> productsList = driver.findElements(By.className("product-item__brand"));
        productsList.get(i).click();

    }

}
