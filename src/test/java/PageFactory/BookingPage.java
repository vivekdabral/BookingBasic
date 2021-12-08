package PageFactory;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingPage extends PageObject {

    @FindBy(xpath = "//a/span[text()='Car rentals']")
    WebElement btnCarRental;

    @FindBy(xpath="//button[@class='modal-mask-closeBtn' and @title='Close']")
    WebElementFacade btnClose;


    public void clickOnCarRental()
    {
        try {

            if (btnClose.isVisible()) {
                btnClose.click();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        btnCarRental.click();
    }

}