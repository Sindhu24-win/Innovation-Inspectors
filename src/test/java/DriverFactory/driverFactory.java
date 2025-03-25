package DriverFactory;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverFactory { 
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>(); // Each thread gets its own WebDriver
    private static ThreadLocal<String> browser = new ThreadLocal<>(); // Each thread gets its own browser setting

    public static final int TIMEOUT = 10;

    private driverFactory() {
        // Private constructor to prevent instantiation
    }

    public static void setBrowser(String browserName) {
        browser.set(browserName);
    }

    public static synchronized WebDriver initiateDriver() {
        if (driver.get() == null) {
            String browserName = browser.get();
            if (browserName == null) {
                browserName = "chrome"; // Default to Chrome if not set
            }

            switch (browserName.toLowerCase()) {
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
            initiateDriver(); // Ensure driver is initialized before returning
        }
        return driver.get();
    }

    public static void openWebPage(String url) {
        getDriver().get(url);
    }

    public static String getCurrentURL() {
        return getDriver().getCurrentUrl();
    }

    public static String getTitle() {
        return getDriver().getTitle();
    }
    public static void getStarted() {
		openWebPage("https://dsportalapp.herokuapp.com/");
	}

	public static void homepage() {
		openWebPage("https://dsportalapp.herokuapp.com/home");
	}

	public static void treepage() {
		openWebPage("https://dsportalapp.herokuapp.com/tree/");
	}

    public static void tearDown() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
            browser.remove();
        }
    }


		
		
}
