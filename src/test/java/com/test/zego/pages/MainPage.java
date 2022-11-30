package com.test.zego.pages;

import com.test.zego.Utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li[@class='main-nav__item list-lv1__item js-nav-item ']")
    List<WebElement> headerMenu;

    public void assertTheUrl(WebDriver driver, String expectedUrl) {
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void headers(WebDriver driver, String header, String url) {

        for (int i = 0; i < headerMenu.size(); i++) {
            if (headerMenu.get(i).getText().equalsIgnoreCase(header)) {
                headerMenu.get(i).click();
                Assert.assertTrue(driver.getCurrentUrl().contains(url));
                driver.quit();
            }

        }

    }

}




