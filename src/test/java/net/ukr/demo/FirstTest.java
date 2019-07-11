package net.ukr.demo;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * created by FAMILY 07.07.2019
 */

public class FirstTest {
    ChromeDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        openUkrNet();
    }

    private void openUkrNet() {
        driver.get("https://www.ukr.net/");
    }

    @Test
    public void testUkrNetOpening() {

        goToSearch();
        clearSearchField();
        clickInSearchInput();
        typeToSearchField(new SearchInput("Test"));
        typeToSearchField(new SearchInput("Second Test"));
        clickWeather();
        clickExchange();
        clickDiesel();
        clickGoroskop();
    }

    private void clickGoroskop() {
        driver.findElementByXPath("/html/body/div[1]/main/div[3]/div[1]/section/ul/li[4]").click();
    }

    private void clickDiesel() {
        driver.findElementByXPath("/html/body/div[1]/main/div[3]/div[1]/section/ul/li[3]").click();
    }

    private void clickExchange() {
        driver.findElementByXPath("/html/body/div[1]/main/div[3]/div[1]/section/ul/li[2]").click();
    }

    private void clickWeather() {
        driver.findElementByXPath("/html/body/div[1]/main/div[3]/div[1]/section/ul/li[1]").click();
    }

    private void typeToSearchField(SearchInput searchInput) {
        driver.findElement(By.id("search-input")).sendKeys(searchInput.getTest());
    }

    private void clickInSearchInput() {
        driver.findElement(By.id("search-input")).click();
    }

    private void clearSearchField() {
        driver.findElement(By.id("search-input")).clear();
    }

    private void goToSearch() {
        driver.findElement(By.id("search-input"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public static boolean isAlertPresent(ChromeDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
