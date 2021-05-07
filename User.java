package homeWork.entities.concretes;

import homeWork.entities.abstracts.Entity;

public class User implements Entity{
	int id;
	private boolean verified;
	private String firstName;
	private String lastName;
	private String eMail;
	private String password;
	
	
	public User() {}

	public User(String firstName, String lastName, String eMail, String password, boolean verified, int id) {
		super();
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
		this.verified=verified;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	
	
	
}
