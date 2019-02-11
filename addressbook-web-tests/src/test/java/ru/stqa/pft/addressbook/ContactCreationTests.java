package ru.stqa.pft.addressbook;


import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    gotoContactPage();
    initContactCreation();
    fillContactForm(new ContactData("FirstName1", "LastName1", "address1", "123456789", "123@mail.ru"));
    enterNewContact();
    returnToHomePage();
  }

}
