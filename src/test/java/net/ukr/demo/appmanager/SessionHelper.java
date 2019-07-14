package net.ukr.demo.appmanager;

import org.openqa.selenium.WebDriver;

/**
 * created by FAMILY 13.07.2019
 */

public class SessionHelper extends HelperBase {


    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        type("//input[@name='login']", username);
        type("//input[@name='pass']", password);
        click("//input[@value='Войти']");
    }
}
