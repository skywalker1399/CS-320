//*
//Skylar Walker
//01/20/24
//
//Module 3 Milestone
//*
package contact;

import java.util.concurrent.atomic.AtomicLong;

public class Contact{

	//attributes
	private final String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	//used to create a unique contactId for every contact
	private static AtomicLong idGenerator = new AtomicLong();
	
	
	//Constructor
	
	public Contact(String firstName, String lastName, String phone, String address) {
		
		
		
		
		//Checks first name meets requirements
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		
		//Checks last name meets requirements
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		
		//Checks phone number meets requirements
		if(phone == null || phone.length()!=10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		
		//Checks address meets requirements
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		//makes unique contactId for every contact created
		this.contactId = String.valueOf(idGenerator.getAndIncrement());
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	//getters
	public String getId() {
		return contactId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	//setters
	//throws illegal argument if input is invalid
	public void setContactId(String contactId) {
		if(contactId == null || contactId.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
	}
	
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		else {
			this.firstName = firstName;
		}
	}
	
	public void setLastName(String lastName) {
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		else {
			this.lastName = lastName;
		}
	}
	
	public void setPhone(String phone) {
		if(phone == null || phone.length()!=10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		else {
			this.phone = phone;
		}
	}
	
	public void setAddress(String address) {
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		else {
			this.address = address;
		}
	}
	
	

}