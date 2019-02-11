package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.gotoContactPage();
    app.initContactCreation();
    app.fillContactForm(new ContactData("FirstName1", "LastName1", "address1", "123456789", "123@mail.ru"));
    app.enterNewContact();
    app.returnToHomePage();
  }

}
