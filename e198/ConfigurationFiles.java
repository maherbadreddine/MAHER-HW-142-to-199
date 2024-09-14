package org.example.e198;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class ConfigReader {
    private Properties properties;

    public ConfigReader() {
        try {
            // Load the config.properties file
            FileInputStream fis = new FileInputStream("resources/config.properties");
            properties = new Properties();
            properties.load(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to get the browser type
    public String getBrowser() {
        return properties.getProperty("browser");
    }

    // Method to get the URL
    public String getUrl() {
        return properties.getProperty("url");
    }

    // Method to get the implicit wait time
    public int getImplicitWait() {
        String waitTime = properties.getProperty("implicitWait");
        return Integer.parseInt(waitTime);
    }
}