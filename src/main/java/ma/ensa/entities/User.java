package ma.ensa.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	private  String EmailID;
	private  String Password;
	private  String Fname;
	private  String Lname;
	
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public User(String emailID, String password, String fname, String lname) {
		EmailID = emailID;
		Password = password;
		Fname = fname;
		Lname = lname;
	}
	public User() {
	}
	@Override
	public String toString() {
		return "User [EmailID=" + EmailID + ", Password=" + Password + ", Fname=" + Fname + ", Lname=" + Lname + "]";
	}
	
	
}
