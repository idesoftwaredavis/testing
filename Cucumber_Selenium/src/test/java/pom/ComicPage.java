package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComicPage extends BasePage  {
    public ComicPage(WebDriver driver){
        super(driver);
    }
    private By ComicTitleLocator = By.xpath("//*[@id='comp-lc61aui31']/h2/span/span/span");

    private String titleComicPage = "HE LITTLE TESTER COMICS SERIES";

    public boolean isTitleComicDisplayed() throws Exception {
        return this.isDisplayed(ComicTitleLocator) && this.getText(ComicTitleLocator).equals(titleComicPage);
    }
}
