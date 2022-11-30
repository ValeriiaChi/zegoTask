package com.test.zego.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;


public class DriverHelper {

    private static WebDriver driver;

    private DriverHelper (){}

    public static WebDriver getDriver() {
        if (driver == null || ((RemoteWebDriver) driver).getSessionId() == null) {
            String browser = "chrome";

            switch (browser) {



                case "chrome":
                   WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.chromedriver().setup();

                    driver = new FirefoxDriver();
                    break;

            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }
        return driver;
    }

}
