package com.test.zego.stepdefinitions;


import com.test.zego.Utils.DriverHelper;
import com.test.zego.pages.BookingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class BookingPageStepDef {
    WebDriver driver = DriverHelper.getDriver();
    BookingPage bookingPage = new BookingPage(driver);

    @Given("User navigates to zego  website")
    public void user_navigates_to_zego_website() {

    }
    @When("User validate Request a Quote button")
    public void user_validate_button() {
        bookingPage.validationRequestAQuoteButton();

    }
    @Then("User clicks Request a Quote button")
    public void user_clicks_button() {
        bookingPage.clickRequestAQuoteButton();

    }
    @Then("User validates title and url")
    public void user_validates_title_and_url() {
        bookingPage.validateHeaderRequestAQuote();


    }
    @Then("User provides credentials")
    public void user_provides_credentials() {
        bookingPage.providesCredentials();


    }

    @Given("choose the service")
    public void choose_the_service() {
        bookingPage.chooseZegoMobile();

    }
    @Then("User clicks Submit")
    public void user_clicks_submit() {
        bookingPage.clickSubmitButton();

    }

    @Given("Validates thank you message")
    public void validates_thank_you_message() {
        bookingPage.validationMessage();

    }









}