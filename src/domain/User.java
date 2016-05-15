package domain;

public class User {
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String telephoneNumber;
	private String password;
	private String address;
	private BeliefProfile beliefProfile;
	
	/**
	 * Constructor
	 * @param firstName
	 * @param lastName
	 * @param emailAddress
	 * @param telephoneNumber
	 * @param password
	 * @param address
	 */
	public User(String firstName, String lastName, String emailAddress,
			String telephoneNumber, String password, String address,
			BeliefProfile beliefProfile) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.telephoneNumber = telephoneNumber;
		this.password = password;
		this.address = address;
		this.beliefProfile = beliefProfile;
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
	
	public BeliefProfile getBeliefProfile() { return beliefProfile; }
	public void setBeliefProfile(BeliefProfile beliefProfile) {
		this.beliefProfile = beliefProfile;
	}
	
	public boolean validateParams() {
		if (firstName == null)
			return false;
		if (lastName == null)
			return false;
		if (emailAddress == null)
			return false;
		if (telephoneNumber == null)
			return false;
		if (password == null)
			return false;
		if (address == null)
			return false;
		
		return true;
	}
	
}
