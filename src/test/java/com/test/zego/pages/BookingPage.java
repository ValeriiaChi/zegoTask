package com.test.zego.pages;

import com.test.zego.Utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {
    public BookingPage(WebDriver driver){
        PageFactory.initElements(driver, this);}

    @FindBy(xpath ="//a[contains(text(),'Request a Quote')]")
    WebElement requestAQuoteButton;

    @FindBy(tagName = "h3")
    WebElement requestAQuoteHeader;

    @FindBy(id = "FirstName")
    WebElement firstNameBox;

    @FindBy(id = "LastName")
    WebElement lastNameBox;

    @FindBy (id = "Email")
    WebElement emailBox;

    @FindBy(id = "Phone")
    WebElement phoneNumberBox;

    @FindBy(id = "Company")
    WebElement companyNameBox;

    @FindBy(id = "Units_Opportunity__c")
    WebElement numberOfUnits;

    @FindBy(id = "LblmktoCheckbox_9901_0")
    WebElement productZegoPayCheckbox;

    @FindBy(id = "LblmktoCheckbox_9901_1")
    WebElement productZegoUtility;

    @FindBy(id = "LblmktoCheckbox_9901_2")
    WebElement productZegoMobile;

    @FindBy(xpath = "//button[.='Submit & Pick a Time']")
    WebElement submitButton;

    @FindBy(xpath = "//h1[@class='page-header__heading']")
    WebElement thankYouMessage;

    public void validationRequestAQuoteButton(){

        Assert.assertEquals("Request a Quote", BrowserUtils.getText(requestAQuoteButton));
    }

    public  void clickRequestAQuoteButton(){
        requestAQuoteButton.click();

    }

    public void validateHeaderRequestAQuote(){
        Assert.assertEquals("Book time with a Sales representative",
                BrowserUtils.getText(requestAQuoteHeader));
    }

    public void providesCredentials(){
        firstNameBox.sendKeys("Valery");
        lastNameBox.sendKeys("Chi");
        emailBox.sendKeys("chi@gmail.com");
        phoneNumberBox.sendKeys("2241235577");
        companyNameBox.sendKeys("STD");
        numberOfUnits.sendKeys("5");
    }

    public void chooseZegoPay(){
        productZegoPayCheckbox.click();
    }

    public void chooseZegoUtility(){
        productZegoUtility.click();
    }
    public void chooseZegoMobile(){
        productZegoMobile.click();

    }

    public void clickSubmitButton(){
        submitButton.click();
    }

    public void validationMessage(){
        Assert.assertEquals("Thank you for your interest in Zego™!", BrowserUtils.getText(thankYouMessage));

    }












    }









