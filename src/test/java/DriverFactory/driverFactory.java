package DriverFactory;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class driverFactory {
    private static driverFactory instance;
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public final static int TIMEOUT = 10;
    private static String browser = "chrome"; // Default browser

    public driverFactory() {
    }

    public static synchronized driverFactory getInstance() {
        if (instance == null) {
            instance = new driverFactory();
        }
        return instance;
    }

    public static synchronized WebDriver initiateDriver() {
        if (driver.get() == null) {
            switch (browser.toLowerCase()) {
                case "firefox":
                    driver.set(new FirefoxDriver());
                    break;
                case "edge":
                    driver.set(new EdgeDriver());
                    break;
                case "chrome":
                default:
                    driver.set(new ChromeDriver());
                    break;
            }
            driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
            driver.get().manage().window().maximize();
        }
        return driver.get();
    }

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            initiateDriver();
        }
        return driver.get();
    }

    public static void setBrowser(String browserName) {
        browser = browserName;
    }

    public static void waitFor(int time) {
        getInstance();
		new WebDriverWait(driverFactory.getDriver(), Duration.ofSeconds(time));
    }

    public static void openwebpage(String url) {
        getInstance();
		driverFactory.getDriver().get(url);
    }

    public static String getCurrentURL() {
        getInstance();
		return driverFactory.getDriver().getCurrentUrl();
    }

    public static String getTitle() {
        getInstance();
		return driverFactory.getDriver().getTitle();
    }

    public static void getStarted() {
        openwebpage("https://dsportalapp.herokuapp.com/");
    }

    public static void homepage() {
        openwebpage("https://dsportalapp.herokuapp.com/home");
    }

    public static void treepage() {
        openwebpage("https://dsportalapp.herokuapp.com/tree/");
    }

   public static void tearDown() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}