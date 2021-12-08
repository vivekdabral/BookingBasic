package PageFactory;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends PageObject {
    String homeURL = "https://www.booking.com";


    @FindBy(xpath = "//a[@class='bui-button bui-button--secondary js-header-login-link'][1]")
    WebElement btnLogin;

    @FindBy(id = "username")
    WebElement txtUserName;

    @FindBy(xpath = "//button/span[text()='Continue with email']")
    WebElement btnUserName;

    @FindBy(id="password")
    WebElement txtPassword;

    @FindBy(xpath = "//button/span[text()='Sign in']")
    WebElement btnSignIn;

    @FindBy(id="password-note")
    WebElement labelPasswordMismatch;


    public void clickOnRegister() {
        btnLogin.click();
    }

    public void navigateToHomePage() {
        getDriver().get(homeURL);
    }

    public void enterUserName(String userName) {
        txtUserName.sendKeys(userName);
        btnUserName.click();
    }

    public void enterPassword(String password) {
        txtPassword.sendKeys(password);
        btnSignIn.click();
    }

    public String getValidationMessage() {
        return labelPasswordMismatch.getText();
    }

}