package com.test.zego.stepdefinitions;


import com.test.zego.Utils.BrowserUtils;
import com.test.zego.Utils.ConfigReader;
import com.test.zego.Utils.DriverHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class Hook {
    public WebDriver driver;
    @Before
    public void setup (){
        driver= DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("zego_url"));
    }
    @After
    public void tearDown(Scenario scenario){
        BrowserUtils.getScreenShotCucumber(scenario, driver);
        driver.quit();

    }


}
