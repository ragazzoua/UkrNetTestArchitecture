package net.ukr.demo.tests;

import org.testng.annotations.Test;

/**
 * created by FAMILY 13.07.2019
 */

public class AddContactTest extends TestBase{

    @Test
    public void testAddContact(){
        app.getNavigationHelper().goToContacts();
        app.getGroupHelper().clickAddContact();
    }

}
