package com.agnotheist.model.domain;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8108418098342156774L;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String telephoneNumber;
	private String password;
	private String address;
	
	/**
	 * User
	 * 
	 * @param firstName
	 * @param lastName
	 * @param emailAddress
	 * @param telephoneNumber
	 * @param password
	 * @param address
	 */
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
	
	/**
	 * 
	 * @return the firstName
	 */
	public String getFirstName() { return firstName; }
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * 
	 * @return the lastName
	 */
	public String getLastName() { return lastName; }
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * 
	 * @return the emailAddress
	 */
	public String getEmailAddress() { return emailAddress; }
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	/**
	 * 
	 * @return the telephoneNumber
	 */
	public String getTelephoneNumber() { return telephoneNumber; }
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	/**
	 * 
	 * @return the password
	 */
	public String getPassword() { return password; }
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * 
	 * @return the address
	 */
	public String getAddress() { return address; }
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * 
	 * @return boolean
	 */
	public boolean validate() {
		if (firstName == null) return false;
		if (lastName == null) return false;
		if (emailAddress == null) return false;
		if (telephoneNumber == null) return false;
		if (password == null) return false;
		if (address == null) return false;
		
		return true;
	}
	
	/**
	 * return boolean if objects are equal
	 */
	@Override
	public boolean equals(Object object) {
		if (this == object) return true;
		if (object == null) return false;
		if (getClass() != object.getClass()) return false;
		
		User otherUser = (User) object;
		
		if (firstName == null && otherUser.firstName != null)
			return false;
		else if (!firstName.equals(otherUser.firstName))
			return false;
		if (lastName == null && otherUser.lastName != null)
			return false;
		else if (!lastName.equals(otherUser.lastName))
			return false;
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
	
	/**
	 * @return hashCode
	 */
	
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
	
	/**
	 * return string of User object
	 */
	@Override
	public String toString() {
		return "User [lastName=" + lastName + ", firstName=" + firstName
				+ ", emailAddress" + emailAddress + ", password=" + password
				+ ", telephoneNumber=" + telephoneNumber + ", address=" + address
				+ "]";
	}
}
