import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.Key;

public class SearchBox  extends BasePage{

    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        WebElement searchElement = driver.findElement(By.id("txtSearchBox"));
        searchElement.sendKeys("kaşık maması");
        searchElement.sendKeys(Keys.ENTER);

    }
}
