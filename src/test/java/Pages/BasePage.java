package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;

    static {
        ChromeOptions options = new ChromeOptions();
        // DesiredCapabilities capabilities = new DesiredCapabilities();
        System.setProperty("webdriver.chromedriver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        // options.addArguments("C:/Users/USER/AppData/Local/Google/Chrome/User Data");
        // capabilities.setCapability(ChromeOptions.CAPABILITY, options);

    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(4));
    }

    // Go to a url-page
    public static void navigateTo(String url) {
        driver.get(url);
    }

    public static void closeBrowser() {
        driver.quit();
    }

    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator) {

        Find(locator).click();
    }

    public void enterString(String locator, String textToWrite) {
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }

    public void visualizeURL() {
        driver.getCurrentUrl();
    }

    public void labelDisplayed(String locator) {
        Find(locator).isDisplayed();
    }
}
