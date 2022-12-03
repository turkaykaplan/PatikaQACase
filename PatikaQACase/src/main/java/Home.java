import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Home extends BasePage {

    public Home(WebDriver driver) {
        super(driver);
    }


    public void search() throws InterruptedException {
        WebElement searchElement = driver.findElement(By.id("txtSearchBox"));
        searchElement.sendKeys("kaşık maması");
        searchElement.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

    }

}
