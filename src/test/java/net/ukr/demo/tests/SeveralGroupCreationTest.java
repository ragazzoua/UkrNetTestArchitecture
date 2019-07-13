package net.ukr.demo.tests;

import net.ukr.demo.model.GroupData;
import org.testng.annotations.Test;

/**
 * created by FAMILY 13.07.2019
 */

public class SeveralGroupCreationTest extends TestBase {


    @Test
    public void severalGroupCreationTest() {

        app.getNavigationHelper().goToContacts();
        app.getGroupHelper().clickAddNewGroup();
        app.getGroupHelper().selectGroupNameField();
        app.getGroupHelper().fillGroupForm(new GroupData("testGroup"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().clickAddNewGroup();
        app.getGroupHelper().selectGroupNameField();
        app.getGroupHelper().fillGroupForm(new GroupData("testGroup1"));
        app.getGroupHelper().submitGroupCreation();
    }


}