package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop = new Properties();

    // Static block to load properties only once
    static {
        try (FileInputStream ip = new FileInputStream("./src/test/resources/Config.properties")) {
            prop.load(ip);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties: " + e.getMessage(), e);
        }
    }

    // Retrieve a property value
    public static String getProperty(String key) {
        return prop.getProperty(key);
    }

    // Retrieve browser property (handles commented-out values)
    public static String getBrowser() {
        String browser = prop.getProperty("browser");
        return (browser != null && !browser.isEmpty()) ? browser.trim() : "chrome"; // Default to Chrome
    }

    // Retrieve URL property
    public static String getUrl() {
        return prop.getProperty("url");
    }

    // Retrieve username
    public static String getUsername() {
        return prop.getProperty("username");
    }

    // Retrieve password
    public static String getPassword() {
        return prop.getProperty("password");
    }
}