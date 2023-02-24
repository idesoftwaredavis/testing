package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {
    private static WebDriver driver; // esta variable es de la clase y no del objeto.
    private static int numberOfCase = 0;

    private DriverManager driverManager;

    @Before
    public void setUp(){
        numberOfCase++;
        System.out.println("Se esta ejecutando el escenario nro: " + numberOfCase);
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();

        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();
    }

    // Cerrar el navegador
    @After
    public void tearDown(){
        System.out.println("El escenario nro : " + numberOfCase + " se ejecuto correctamente");
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
