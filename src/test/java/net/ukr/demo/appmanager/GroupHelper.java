package net.ukr.demo.appmanager;

import net.ukr.demo.model.GroupData;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * created by FAMILY 13.07.2019
 */

public class GroupHelper {
    ChromeDriver driver;

    public void submitGroupCreation() {
        driver.findElementByXPath("//input[@ct='CreateGroup']").click();
    }

    public void fillGroupForm(GroupData groupData) {
        driver.findElementByXPath("//*[@id='workBody']/div[2]/div[1]/div[2]/div[3]/ul/li[1]/p/input[1]").sendKeys(groupData.getGroupName());
    }

    public void selectGroupNameField() {
        driver.findElementByXPath("//*[@id='workBody']/div[2]/div[1]/div[2]/div[3]/ul/li[1]/p/input[1]").click();
    }

    public void clickAddNewGroup() {
        driver.findElementByXPath("//*[@id='add_group']/i").click();
    }
}
