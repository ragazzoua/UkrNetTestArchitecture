package net.ukr.demo.appmanager;

import net.ukr.demo.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * created by FAMILY 13.07.2019
 */

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver driver) {
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

    public void clickAddContact() {
        click("/html/body/div[1]/div[5]/ul/li[6]/a");
    }

    public void selectGroup(int index){
        driver.findElements(By.xpath("//span[@ct='GroupClick']")).get(index).click();
    }

    public int getGroupCount() {
        return driver.findElements(By.xpath("//span[@ct='GroupClick']")).size();
    }

    public List<GroupData> getGroupList() {
        List<GroupData> list = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.xpath("//span[@ct='GroupClick']"));
        for (WebElement element : elements) {
            String name = element.getText();
            GroupData group = new GroupData(name);
            list.add(group);
        }
        return list;
    }
}
