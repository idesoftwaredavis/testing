package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import pom.ComicPage;
import pom.HomePage;

public class TestBase {
    protected  WebDriver driver = Hooks.getDriver();
    protected HomePage homePage = new HomePage(driver);

    protected ComicPage comicPage = new ComicPage(driver);
}
