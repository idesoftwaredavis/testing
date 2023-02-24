package runner.browser_manager;

import org.openqa.selenium.WebDriver;

// protected -> La puede ver la misma clase y sus clases hijas
public abstract class DriverManager {
    protected WebDriver driver; // lo instanciaremos

    protected abstract void createDriver();

    // cerrar la instancia del navegador
    public void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

    // obtener el driver
    public WebDriver getDriver(){
        if(driver == null){
            createDriver();
        }
        return driver;
    }
}
