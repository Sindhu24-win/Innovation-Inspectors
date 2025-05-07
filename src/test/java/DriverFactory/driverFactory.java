package DriverFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private static ThreadLocal<String> browser = new ThreadLocal<>();

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
                    WebDriverManager.firefoxdriver().setup();
                    driver.set(new FirefoxDriver());
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver.set(new EdgeDriver());
                    break;
                case "chrome":
                default:
                    WebDriverManager.chromedriver().setup();
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

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
            browser.remove();
        }
    }
}
