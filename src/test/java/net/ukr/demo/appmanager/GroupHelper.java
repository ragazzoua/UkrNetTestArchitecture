package net.ukr.demo.appmanager;

import net.ukr.demo.model.GroupData;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * created by FAMILY 13.07.2019
 */

public class GroupHelper extends HelperBase {
    private ChromeDriver driver;

    public GroupHelper(ChromeDriver driver) {
        this.driver = driver;
    }

    public void submitGroupCreation() {
        click("//input[@ct='CreateGroup']");
    }

    private void click(String locator) {
        driver.findElementByXPath(locator).click();
    }

    public void fillGroupForm(GroupData groupData) {
        type("//*[@id='workBody']/div[2]/div[1]/div[2]/div[3]/ul/li[1]/p/input[1]", groupData.getGroupName());
    }

    private void type(String locator, String text) {
        driver.findElementByXPath(locator).sendKeys(text);
    }

    public void selectGroupNameField() {
        click("//*[@id='workBody']/div[2]/div[1]/div[2]/div[3]/ul/li[1]/p/input[1]");
    }

    public void clickAddNewGroup() {
        click("//*[@id='add_group']/i");
    }
}
