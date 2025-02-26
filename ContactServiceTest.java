package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contact.ContactService;

import contact.Contact;

class ContactServiceTest {

	@Test //tests the creation of a class
	void testAddContact() {
		ContactService contactService = new ContactService();
		contactService.addContact("Tom", "AddCon", "1234567890", "123456lane");
		contactService.printContacts();
		
	}
	
	@Test //tests the first name update
	void testUpdateFirstName() {
		ContactService contactService = new ContactService();
		contactService.addContact("Joe", "FirstName", "1234567890", "123456lane");
		contactService.updateFirstName("Test", "4");
		contactService.printContacts();
	}
	
	@Test //tests the last name update
	void testUpdateLastName() {
		ContactService contactService = new ContactService();
		contactService.addContact("LastName", "Williams", "1234567890", "123456lane");
		contactService.updateLastName("Test", "0");
		contactService.printContacts();
	}
	
	@Test //tests the phone update
	void testUpdatePhone() {
		ContactService contactService = new ContactService();
		contactService.addContact("Phone", "Williams", "1234567890", "123456lane");
		contactService.updatePhone("TestPhone1", "2");
		contactService.printContacts();
	}
	
	@Test //tests the address update
	void testUpdateAddress() {
		ContactService contactService = new ContactService();
		contactService.addContact("Address", "Williams", "1234567890", "123456lane");
		contactService.updateAddress("TestAddresss", "3");
		contactService.printContacts();
	}
	
	@Test //tests delete
	void testDeleteContact() {
		ContactService contactService = new ContactService();
		//contactService.printContacts();
		contactService.addContact("Delete", "Williams", "1234567890", "123456lane");
		contactService.printContacts();
		System.out.println("delete");
		contactService.deleteContact("1");
		//Tries to update a name but contact list is empty.
		contactService.updateFirstName("deleted", "0");
		contactService.printContacts();
		//System.out.println("empty" + "\n");
	}
	
	

}


