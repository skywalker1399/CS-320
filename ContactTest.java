package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;


class ContactTest {

	@Test //tests a contact creation
	void testContact() {
		Contact contact = new Contact("Tom", "williams", "1111111111", "address" );
		assert(contact.getFirstName().equals("Tom"));
		assert(contact.getLastName().equals("williams"));
		assert(contact.getPhone().equals("1111111111"));
		assert(contact.getAddress().equals("address"));
	}
	
	@Test //test length
	void testContactfirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Tom123456789", "williams", "1111111111", "address");
		});			
	}

	@Test
	void testContactLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Tom", "williams123456", "1111111111", "address");
		});			
	}
	
	@Test
	void testContactPhoneToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Tom", "williams", "11111111112", "address");
		});			
	}
	
	@Test //test phone being short
	void testContactPhoneToShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Tom", "williams", "11111111", "address");
		});			
	}
	
	@Test
	void testContactAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Tom", "williams", "1111111111", "address123456789912345678981234567897");
		});			
	}
	

	
	@Test //tests for null values
	void testContactFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "williams", "1111111111", "address");
		});			
	}
	
	@Test
	void testContactLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Tom", null, "1111111111", "address");
		});			
	}
	
	@Test
	void testContactPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Tom", "williams", null, "address");
		});			
	}
	
	@Test
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Tom", "williams", "1111111111", null);
		});			
	}
	

	
}
