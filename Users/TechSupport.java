package Users ;

import java.util.Date;

import EnumsAndComparators.Gender;

public class TechSupport extends Employee
{
	public TechSupport(String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber){
    super(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);
	}
	
	public void addRequest() {
		// TODO implement me	
	}
	
	public void viewOrder() {
		// TODO implement me	
	}
	
	public void showMenu() {
		// TODO implement me	
	}
}
