import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


//  Test Design
public class AllTest extends BaseTest {

    Home home;
    ProductsMenu productsMenu;
    ProductPage productPage;
    CartPage cartPage;
    LoginPage loginPage;


    @Test
    @Order(1)
    public void searchProduct() throws InterruptedException {
        home = new Home(driver);
        home.searchBox().search("kaşık maması");
        Thread.sleep(3000);
        // Ürün aratıldı.
    }

    @Test
    @Order(2)

    public void selectProduct() throws InterruptedException {
        productsMenu = new ProductsMenu(driver);
        productsMenu.selectProduct(1);

        //  Ürün seçildi
    }

    @Test
    @Order(3)

    public void addCart() throws InterruptedException {
        Thread.sleep(3000);
        productPage = new ProductPage(driver);

        productPage.addToCart();

        productPage.checkProduct();
        //  Ürün sepete eklendi.
    }


    @Test
    @Order(4)

    public void goCart() throws InterruptedException {
        Thread.sleep(3000);
        cartPage = new CartPage(driver);
        cartPage.clickCart();

        //  Sepet görüntülendi.


    }

    @Test
    @Order(5)

    public void clickFinishButton() throws InterruptedException {
        Thread.sleep(3000);

        cartPage.finishShopping();

        // Alışverişi tamamla butonuna tıklandı.
    }

    @Test
    @Order(6)
    public void loginPage() throws InterruptedException {
        Thread.sleep(3000);
        loginPage = new LoginPage(driver);
        loginPage.checkLoginPage();

        //  Üye giriş ekranı doğrulandı.

    }
}
