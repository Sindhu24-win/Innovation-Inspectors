package DriverFactory;



import java.time.Duration;

import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.WebDriverWait;



public class DriverFactory {

	 private static DriverFactory instance;
	    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	    public final static int TIMEOUT = 10; 

	    private DriverFactory() {
	    }

	    public static synchronized DriverFactory getInstance() {
	        if (instance == null) {
	            instance = new DriverFactory();
	        }
	        return instance;
	    }

	    public static synchronized WebDriver initiateDriver() {
	        if (driver.get() == null) {
	            driver.set(new EdgeDriver());
	            driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	            driver.get().manage().window().maximize();
	        }
	        return driver.get();
	    }

	    public WebDriver getDriver() {
	        if (driver.get() == null) {
	            initiateDriver();
	        }
	        return driver.get();
	    }

	    public static void waitFor(int time) {
	        new WebDriverWait(getInstance().getDriver(), Duration.ofSeconds(time));
	    }

	    public static void openwebpage(String url) {
	        getInstance().getDriver().get(url);
	    }

	    public static String getCurrentURL() {
	        return getInstance().getDriver().getCurrentUrl();
	    }
	    
	    public static String getTitle() {
	        return getInstance().getDriver().getTitle();
	    }
	    public static void getstatred() {
	        openwebpage("https://dsportalapp.herokuapp.com/");
	    }

	    public static void homepage() {
	         openwebpage("https://dsportalapp.herokuapp.com/home");
	    }

	    


	    public static void tearDown() {
	        if (driver.get() != null) {
	            driver.get().quit();
	            driver.remove();
	        }
	    }

	    
}

