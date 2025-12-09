package demo.example.models;

public class Users {

	public String firstName;
	
	public String lastName;
	
	public String address;
	
	public String userBio;
	
	public String phone;

	public Users() {
	}

	public Users(String firstName, String lastName,  String address, String userBio, String phone) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.userBio = userBio;
		this.phone = phone;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserBio() {
		return userBio;
	}

	public void setUserBio(String userBio) {
		this.userBio = userBio;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
