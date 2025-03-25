package DriverFactory;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.support.ui.WebDriverWait;



public class driverFactory {

	
	    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	    private static ThreadLocal<String> browser = new ThreadLocal<>(); 
	    public static  final int TIMEOUT = 10; 

	    private driverFactory() {
	    	
	    }
	    public static void setBrowser(String browserName) {
	        browser.set(browserName);
	    }
	    public static synchronized WebDriver initiateDriver() {
	        if (driver.get() == null) {
	            String browserName = browser.get();
	            if (browserName == null) {
	                browserName = "edge"; // Default to Edge if not set
	            }

	            switch (browserName.toLowerCase()) {
	                case "firefox":
	                    driver.set(new FirefoxDriver());
	                    break;
	                case "chrome":
	                    driver.set(new ChromeDriver());
	                    break;
	                case "edge":
	                default:
	                    driver.set(new EdgeDriver());
	                    break;
	            }

	            driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	            driver.get().manage().window().maximize();
	        }
	        return driver.get();
	    }
	   

	   

	    public static  WebDriver getDriver() {
	        if (driver.get() == null) {
	            initiateDriver();
	        }
	        return driver.get();
	    }

	   

	    public static void openwebpage(String url) {
	       getDriver().get(url);
	    }

	    public static String getCurrentURL() {
	        return getDriver().getCurrentUrl();
	    }
	    
	    public static String getTitle() {
	        return getDriver().getTitle();
	    }
	    public static void getStatred() {
	        openwebpage("https://dsportalapp.herokuapp.com/");
	    }

	    public static void homepage() {
	         openwebpage("https://dsportalapp.herokuapp.com/home");
	    }

	    


	    public static void tearDown() {
	        if (driver.get() != null) {
	            driver.get().quit();
	            driver.remove();
	            browser.remove();
	        }
	    }

	    
}

