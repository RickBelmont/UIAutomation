package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class booksPage extends BasePage {

    private String emailUserBox = "//input[@id='email']";
    private String emailPasswordBox = "//input[@id='password']";
    private String singInBox = "//span[contains(text(),'Sign In')]";
    private String qalibraryLabel = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]";
    private String ErrorlogginginUnabletofindaccount = "//body/div[@id='root']/div[1]/main[1]/div[1]";
    private String completeThisMessage = "//body/div[@id='root']/div[1]/main[1]/div[2]/form[1]/button[1]/span[2]";

    public booksPage() {
        super(driver);
    }

    public void navigateToBooksUrl() {
        navigateTo(
                "https://qa-library-dev.herokuapp.com/library-login");
    }

    public void clickOnEmailUserBox() {
        clickElement(emailUserBox);
    }

    public void enterUsername(String textToWrite) {
        enterString(emailUserBox, textToWrite);
    }

    public void enterPassword(String textToWrite) {
        enterString(emailPasswordBox, textToWrite);
    }

    public void clickPasswordBox() {
        clickElement(emailPasswordBox);
    }

    public void clickSingInBox() {
        clickElement(singInBox);
    }

    public void getToHomePage(String currentUrl) {
        visualizeURL();
    }

    public void labelHomePage() {
        labelDisplayed(qalibraryLabel);
    }

    public void messageErrorLogIn() {
        labelDisplayed(ErrorlogginginUnabletofindaccount);
    }

    public void completeMessage() {
        labelDisplayed(completeThisMessage);
    }
}
