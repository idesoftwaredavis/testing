package runner.browser_manager;

public class DriverManagerFactory {

    // Encargada de crear los distintos navegadores, mediante un tipo de Driver
    // En caso de que se encuentre, se añade una instancia del driverManager al Manager en cuestion
    public static DriverManager getManager(DriverType type){
        DriverManager driverManager = null;

        switch(type){
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;

            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            default:
                System.out.println("Invalid browser selected");
                break;
        }

        return driverManager;
    }

}
