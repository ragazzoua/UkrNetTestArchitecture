package net.ukr.demo;

import org.testng.annotations.Test;

/**
 * created by FAMILY 07.07.2019
 */

public class GroupCreationTest extends TestBase {


    @Test
    public void groupCreationTest() {


        goToContacts();
        clickAddNewGroup();
        selectGroupNameField();
        fillGroupForm(new GroupData("new group"));
        submitGroupCreation();


    }


}
