
public class ContactDetails {
	
	private String email;
	private String telephoneNumber;
	private Address address;
	
	public ContactDetails(String email, String telephoneNumber, Address address) {
		this.setEmail(email);
		this.setTelephoneNumber(telephoneNumber);
		this.setAddress(address);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
