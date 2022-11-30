package com.test.zego.stepdefinitions;

import com.test.zego.Utils.DriverHelper;
import com.test.zego.pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class MainPageStepDef {

    WebDriver driver = DriverHelper.getDriver();
MainPage mainPage = new MainPage(driver);
    @Then("User validates urs is {string}")
    public void user_validates_urs_is(String expectedURL) {
        mainPage.assertTheUrl(driver, "https://www.gozego.com/schedule-a-demo/");
    }

    @Then("User clicks {string} and validates the url contains {string}")
        public void user_clicks_and_validates_the_url_contains(String string, String header) {
            mainPage.headers(driver, "Solutions", "solutions");
        }




    }

