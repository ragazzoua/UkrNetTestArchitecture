package net.ukr.demo;

import org.testng.annotations.Test;

/**
 * created by FAMILY 07.07.2019
 */

public class GroupCreationTest extends TestBase {


    @Test
    public void groupCreationTest() {


        app.goToContacts();
        app.clickAddNewGroup();
        app.selectGroupNameField();
        app.fillGroupForm(new GroupData("new group"));
        app.submitGroupCreation();


    }


}
