package com.agnotheist.model.domain;

public class User {
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String telephoneNumber;
	private String password;
	private String address;
	
	public User(String firstName, String lastName, String emailAddress,
			String telephoneNumber, String password, String address) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.telephoneNumber = telephoneNumber;
		this.password = password;
		this.address = address;
	}
	
	public String getFirstName() { return firstName; }
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() { return lastName; }
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmailAddress() { return emailAddress; }
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getTelephoneNumber() { return telephoneNumber; }
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	public String getPassword() { return password; }
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAddress() { return address; }
	public void setAddress(String address) {
		this.address = address;
	}
	
	public boolean validate() {
		if (firstName == null) return false;
		if (lastName == null) return false;
		if (emailAddress == null) return false;
		if (telephoneNumber == null) return false;
		if (password == null) return false;
		if (address == null) return false;
		
		return true;
	}
	
	@Override
	public boolean equals(Object object) {
		if (this == object) return true;
		if (object == null) return false;
		if (getClass() != object.getClass()) return false;
		
		User otherUser = (User) object;
		
		if (emailAddress == null && otherUser.emailAddress != null)
			return false;
		else if (!emailAddress.equals(otherUser.emailAddress))
			return false;
		if (telephoneNumber == null && otherUser.telephoneNumber != null)
			return false;
		else if (!telephoneNumber.equals(otherUser.telephoneNumber))
			return false;
		if (password == null && otherUser.password != null)
			return false;
		else if (!password.equals(otherUser.password))
			return false;
		if (address == null && otherUser.address != null)
			return false;
		else if (!address.equals(otherUser.address))
			return false;

		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 97;
		int result = 1;
		
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + 
				((telephoneNumber == null) ? 0 : telephoneNumber.hashCode());
		result = prime * result + 
				((emailAddress == null) ? 0 : emailAddress.hashCode());
		
		return result;
		
	}
	
	@Override
	public String toString() {
		return "User [lastName=" + lastName + ", firstName=" + firstName
				+ ", emailAddress" + emailAddress + ", password=" + password
				+ ", telephoneNumber=" + telephoneNumber + ", address=" + address
				+ "]";
	}
}
