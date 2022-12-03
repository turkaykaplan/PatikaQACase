import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsMenu extends BasePage {

    public ProductsMenu(WebDriver driver) throws InterruptedException {

        super(driver);


    }


    public void goToProduct() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/img")).click();
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1100)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,1100)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,1100)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,1100)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,1100)");
        Thread.sleep(1000);
    }

    public void selectProduct() throws InterruptedException {
        List<WebElement> productsList = driver.findElements(By.xpath("//*[@class='row product-list']//*[@class='btn close-btn ng-star-inserted']"));
        WebElement lastProduct = productsList.get(productsList.size() - 1);
        lastProduct.click();
    }



}
