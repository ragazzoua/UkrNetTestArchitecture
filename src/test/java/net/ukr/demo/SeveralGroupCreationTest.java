package net.ukr.demo;

import org.testng.annotations.Test;

/**
 * created by FAMILY 13.07.2019
 */

public class SeveralGroupCreationTest extends TestBase {


    @Test
    public void severalGroupCreationTest() {

        goToContacts();
        clickAddNewGroup();
        selectGroupNameField();
        fillGroupForm(new GroupData("testGroup"));
        submitGroupCreation();
        clickAddNewGroup();
        selectGroupNameField();
        fillGroupForm(new GroupData("testGroup1"));
        submitGroupCreation();
    }


}