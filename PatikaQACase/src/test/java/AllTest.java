import org.junit.Assert;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


//  Test Design
public class AllTest extends BaseTest {

    Home home;
    ProductsMenu productsMenu;
    CartPage cartPage;
    LoginPage loginPage;


    @Test
    @Order(1)
    public void searchProduct() throws InterruptedException {
        home = new Home(driver);
        home.search();
        // Ürün aratıldı.
    }

    @Test
    @Order(2)
    public void selectAndCheckProduct() throws InterruptedException {
        productsMenu = new ProductsMenu(driver);
        Thread.sleep(1000);
        productsMenu.goToProduct();
        Thread.sleep(1000);
        List<WebElement> firstCheckProductList = driver.findElements(By.xpath("//*[@class='btn close-btn ng-star-inserted']//..//..//..//..//..//*//*//*[@class='description plist-desc']"));
        WebElement firstCheckProduct = firstCheckProductList.get(firstCheckProductList.size()-1);
        String firstCheckProductText = firstCheckProduct.getText();
        System.out.println("Sepete eklemeden önce: " + firstCheckProductText);
        Thread.sleep(1000);
        productsMenu.selectProduct();
        Thread.sleep(1000);
        cartPage = new CartPage(driver);
        Thread.sleep(1000);
        cartPage.clickCart();
        Thread.sleep(1000);
        WebElement cartProduct = driver.findElement(By.xpath("//*[@class='basket-content']//*[@class='cx-link']/h2"));
        String cartProductText = cartProduct.getText();
        System.out.println("Sepete ekledikten sonra: " + cartProductText);
        Assert.assertEquals(firstCheckProductText, cartProductText);
        //  Ürün seçildi & ürünlerin aynı olduğu doğrulandı.
    }


    @Test
    @Order(3)

    public void clickFinishButton() throws InterruptedException {
        Thread.sleep(1000);
        cartPage.finishShopping();

        // "Alışverişi tamamla" butonuna tıklandı.
    }

    @Test
    @Order(4)
    public void loginPage() throws InterruptedException {
        Thread.sleep(2000);
        loginPage = new LoginPage(driver);
        loginPage.checkLoginPage();

        //  Üye giriş ekranı doğrulandı.

    }
}
