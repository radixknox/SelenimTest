package com.crm.qa.base;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;

    // Constructor to initialize properties
    public TestBase() {
        prop = new Properties();
        FileInputStream ip = null;
        try {
            // Get the Jenkins workspace path from the system environment
            String workspacePath = System.getenv("WORKSPACE");

            // Construct the file path using File.separator for platform independence
            String filePath = workspacePath + "\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties";

            ip = new FileInputStream(filePath);
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ip != null) {
                try {
                    ip.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Method to initialize WebDriver and open URL
    public static void initialize() {
        String browserName = prop.getProperty("browser");
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriverlocation"));
            driver = new ChromeDriver();
        }
        driver.get(prop.getProperty("url"));
    }

    // Method to quit WebDriver
    public void tearDown() {
        driver.quit();
    }
}
