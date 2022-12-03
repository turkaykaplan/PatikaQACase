import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void checkLoginPage() throws InterruptedException {
        Thread.sleep(1000);
        WebElement loginCheck = driver.findElement(By.xpath("//*[@class='btn-link-second-menu d-block']"));
        String loginCheckText = loginCheck.getText();

        Assert.assertTrue(loginCheckText.contains("Giriş Yap"));
        System.out.println("Üye giriş ekranı doğrulandı.");
        // Üye giriş ekranı görüntülendi.

    }


}
