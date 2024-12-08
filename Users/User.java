package Users ;

import java.util.*;
import EnumsAndComparators.Gender;

public abstract class User
{
	
	private String firstName;
	
	private String lastName;
	
	private int id;
	
	private String username;

	
	private Date registrationDate;
	
	private String phoneNumber;
	
	private Gender gender;
	
	private String email;
	
	private int passportNumber;

  public User(String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber){
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;
    this.username = username;
    this.registrationDate =  registrationDate;
    this.phoneNumber = phoneNumber;
    this.gender = gender;
    this.email = email;
    this.passportNumber = passportNumber;
  }
  
  public void showMenu() {
	}

	public void sendMessage(User user) {
	}
	
	public void viewNews() {
	}

  public void editPassword(String password) {
    
  }


  // Getters and setters
	public String getFirstName() {
		return this.firstName;	
	}
	
	public String getLastName() {
		return this.lastName;	
	}
	
	public int getUserId() {
		return this.id;	
	}
	
	public String getEmail() {
		return this.email;	
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;	
	}
	
	public Gender getGender() {
		return this.gender;	
	}
	
	public String getUsername() {
		return this.username;	
	}
	
	public Date getRegistrationDate() {
    return this.registrationDate;
	}
	
}
