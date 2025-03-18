package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private static Properties prop = new Properties();

	static {
	try (FileInputStream ip = new FileInputStream("./src/test/resources/Config.properties")) {
	prop.load(ip);
	} catch (IOException e) {
	throw new RuntimeException("Failed to load config.properties: " + e.getMessage(), e);
	}
	}

	public static String getProperty(String key) {
	return prop.getProperty(key);
	}

	public static String getBrowser() {
	String browser = prop.getProperty("browser");
	return (browser != null && !browser.isEmpty()) ? browser.trim() : "chrome"; // Default to Chrome
	}

	public static String getUrl() {
	return prop.getProperty("url");
	}

	public static String getUsername() {
	return prop.getProperty("username");
	}

	public static String getPassword() {
	return prop.getProperty("password");

}
	
}
