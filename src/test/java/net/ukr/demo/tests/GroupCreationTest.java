package net.ukr.demo.tests;

import net.ukr.demo.model.GroupData;
import org.testng.annotations.Test;

/**
 * created by FAMILY 07.07.2019
 */

public class GroupCreationTest extends TestBase {


    @Test
    public void groupCreationTest() {


        app.getNavigationHelper().goToContacts();
        app.getGroupHelper().clickAddNewGroup();
        app.getGroupHelper().selectGroupNameField();
        app.getGroupHelper().fillGroupForm(new GroupData("null"));
        app.getGroupHelper().submitGroupCreation();


    }


}
