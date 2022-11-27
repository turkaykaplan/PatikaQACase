import org.openqa.selenium.WebDriver;


public class Home extends BasePage {

    SearchBox searchBox;
    public Home(WebDriver driver) {

        super(driver);
        searchBox = new SearchBox(driver);
    }



    public SearchBox searchBox() {
        return this.searchBox;

    }
}
