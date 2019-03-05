package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Set;

public class ContactModificationTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().homePage();
    if (app.contact().all().size() == 0) {
      app.contact().create(new ContactData().withFirstname("FirstName1").withLastname("LastName1"), true);
    }
  }

  @Test
  public void testContactModification() throws Exception {

    Set<ContactData> before = app.contact().all();
    ContactData modifiedContact = before.iterator().next();
    ContactData contact = new ContactData()
            .withId(modifiedContact.getId()).withFirstname("FirstName3").withLastname("LastName1");
    app.contact().modify(contact);
    Set<ContactData> after = app.contact().all();

    before.remove(modifiedContact);
    before.add(contact);
    Assert.assertEquals(before, after);

  }


}
