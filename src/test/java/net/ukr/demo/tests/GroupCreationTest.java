package net.ukr.demo.tests;

import net.ukr.demo.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * created by FAMILY 07.07.2019
 */

public class GroupCreationTest extends TestBase {


    @Test
    public void groupCreationTest() {
        app.getNavigationHelper().goToContacts();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().clickAddNewGroup();
        app.getGroupHelper().selectGroupNameField();
        app.getGroupHelper().fillGroupForm(new GroupData("null"));
        app.getGroupHelper().submitGroupCreation();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before + 1);


    }


}
