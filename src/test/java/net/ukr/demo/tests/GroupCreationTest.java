package net.ukr.demo.tests;

import net.ukr.demo.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * created by FAMILY 07.07.2019
 */

public class GroupCreationTest extends TestBase {


    @Test
    public void groupCreationTest() {
        app.getNavigationHelper().goToContacts();
        List<GroupData> before = app.getGroupHelper().getGroupList();

        app.getGroupHelper().clickAddNewGroup();
        app.getGroupHelper().selectGroupNameField();
        app.getGroupHelper().fillGroupForm(new GroupData("null1110"));
        app.getGroupHelper().submitGroupCreation();
        List<GroupData> after = app.getGroupHelper().getGroupList();

        Assert.assertEquals(after.size(), before.size() + 1);


    }


}
