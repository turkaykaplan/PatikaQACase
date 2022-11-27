import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void checkLoginPage() throws InterruptedException {

        WebElement alert = driver.findElement(By.id("btnSubmitLogin"));

        Assert.assertTrue(alert.getText().contains("Giriş Yap"));
        System.out.println("Üye giriş ekranı doğrulandı.");
        // Üye giriş ekranı görüntülendi.

    }




}
