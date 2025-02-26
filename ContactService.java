package contact;


import java.util.ArrayList;

public class ContactService {

	//make a list for the contacts
	public ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	//used to check testing
	public void printContacts() {
		System.out.println("ContactList: ");
		for(int i = 0; i < contactList.size(); i++) {
			System.out.print("Contact " + contactList.get(i).getId());
			System.out.print(" :First Name-" + contactList.get(i).getFirstName());
			System.out.print(" : Last Name-" + contactList.get(i).getLastName());
			System.out.print(" : Phone Number- " + contactList.get(i).getPhone());
			System.out.println(" : Address-" + contactList.get(i).getAddress()+ "\n");
			
		}
	}
	
	//creates a new contact using constructor
	public void addContact(String firstName, String lastName, String phone, String address) {
		Contact contact = new Contact(firstName, lastName, phone, address);
		contactList.add(contact);
	}
	
	//delete contact
	public void deleteContact(String contactId) {
		//checks list for id
		for(int i = 0; i < contactList.size(); i++) {
			
			//If found it deletes contact
			if(contactList.get(i).getId().equals(contactId)) {
				contactList.remove(i);
				System.out.println("Contact " + i + " removed");
				break;
			}
			//if number i isn't in the list it tells the user
			if(i == contactList.size()-1) {
				System.out.println("ID not found.");
			}
		}
	}
	//updates first name
	public void updateFirstName(String newName, String contactId) {
		for(int   i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getId().equals(contactId)) {
				//sets the new first name
				contactList.get(i).setFirstName(newName);
				break;
			}
			
			if(i == contactList.size()-1) {
				System.out.println("ID not found.");
			}
		}
	}
	//updates last name
	public void updateLastName(String newName, String contactId) {
		for(int   i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getId().equals(contactId)) {
				//sets the new last name
				contactList.get(i).setLastName(newName);
				break;
			}
			
			if(i == contactList.size()-1) {
				System.out.println("ID not found.");
			}
		}
	}
	
	//updates phone number
	public void updatePhone(String newPhone, String contactId) {
		for(int   i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getId().equals(contactId)) {
				//sets the new Phone number
				contactList.get(i).setPhone(newPhone);
				break;
			}
			
			if(i == contactList.size()-1) {
				System.out.println("ID not found.");
			}
		}
	}
	
	//updates address
	public void updateAddress(String newAddress, String contactId) {
		for(int   i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getId().equals(contactId)) {
				//sets the new Address
				contactList.get(i).setAddress(newAddress);
				break;
			}
			
			if(i == contactList.size()-1) {
				System.out.println("ID not found.");
			}
		}
	}
	
	
}
