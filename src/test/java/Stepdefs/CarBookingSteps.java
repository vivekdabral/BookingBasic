package Stepdefs;

import PageFactory.bookingPage;
import io.cucumber.java.en.And;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CarBookingSteps {

    bookingPage bookingPage;

    @And("User clicks on Car Rentals tab")
    public void userClicksOnCarRentalsTab() {

        bookingPage.clickOnCarRental();
        log.info("After clicking the Rental tab");
    }


}
