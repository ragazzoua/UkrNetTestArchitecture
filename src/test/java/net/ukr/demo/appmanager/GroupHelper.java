package net.ukr.demo.appmanager;

import net.ukr.demo.model.GroupData;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * created by FAMILY 13.07.2019
 */

public class GroupHelper extends HelperBase {

    public GroupHelper(ChromeDriver driver) {
        super(driver);
    }

    public void submitGroupCreation() {
        click("//input[@ct='CreateGroup']");
    }

    public void fillGroupForm(GroupData groupData) {
        type("//*[@id='workBody']/div[2]/div[1]/div[2]/div[3]/ul/li[1]/p/input[1]", groupData.getGroupName());
    }

    public void selectGroupNameField() {
        click("//*[@id='workBody']/div[2]/div[1]/div[2]/div[3]/ul/li[1]/p/input[1]");
    }

    public void clickAddNewGroup() {
        click("//*[@id='add_group']/i");
    }

    public void clickAddContact(){
        click("/html/body/div[1]/div[5]/ul/li[6]/a");
    }
}
