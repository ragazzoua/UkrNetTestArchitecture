package net.ukr.demo.tests;

import net.ukr.demo.model.GroupData;
import org.testng.annotations.Test;

/**
 * created by FAMILY 13.07.2019
 */

public class SeveralGroupCreationTest extends TestBase {


    @Test
    public void severalGroupCreationTest() {

        app.goToContacts();
        app.clickAddNewGroup();
        app.selectGroupNameField();
        app.fillGroupForm(new GroupData("testGroup"));
        app.submitGroupCreation();
        app.clickAddNewGroup();
        app.selectGroupNameField();
        app.fillGroupForm(new GroupData("testGroup1"));
        app.submitGroupCreation();
    }


}