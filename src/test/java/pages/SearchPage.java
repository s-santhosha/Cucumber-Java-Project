package pages;

import basePage.BasePage;
import io.cucumber.java.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SearchPage extends BasePage {

    private static final String URL_PAGE = "https://www.google.com";
    private static final By searchField = By.id("APjFqb");

    private static final By searchButton = By.cssSelector(".FPdoLc [value='Google Search']");
    private static final By searchButtonJs = By.cssSelector("[jsname] [value='Google Search']");

    public void navigateToGoogleHomePage() throws InterruptedException {
        driver.navigate().to(URL_PAGE);
    }

    public void enterTextInSearchField(String text) {
        wait.waitForElementDisplayed(searchField);
        driver.findElement(searchField).sendKeys(text);
    }

    public void clickButton() {
        wait.waitForElementDisplayed(searchButtonJs);
        WebElement element = driver.findElement(searchButtonJs);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void verifyResultsDisplayed() {
        driver.getTitle().contains("This is test");
    }
}
