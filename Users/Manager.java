package Users ;

import java.util.*;
import EnumsAndComparators.*;
import UsersCapabilities.CanViewResearches;
import UsersCapabilities.Manageable;

public class Manager extends Employee implements CanViewResearches, Manageable
{
	
	private ManagePosition managerPosition;
	public Manager(String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber){
		super(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);  
	}
	public Manager(String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber, ManagePosition managerPosition){
		super(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);  
    this.managerPosition = managerPosition;
	}
	
  public void setManagerPosition(ManagePosition managerPosition){
    this.managerPosition = managerPosition;
  }

	public void addDiscipline() {
		// TODO implement me	
	}
	
	public void removeDiscipline() {
		// TODO implement me	
	}
	
	public void disciplineRegistration() {
		// TODO implement me	
	}
	
	public void dropDiscipline() {
		// TODO implement me	
	}
	
	public void showMenu() {
		// TODO implement me	
	}
	
	public void viewDisciplineSchedule() {
		// TODO implement me	
	}
	
	public void viewOrganisations() {
		// TODO implement me	
	}
	
	public void viewStudents() {
		// TODO implement me	
	}
	
	public void viewTeachers() {
		// TODO implement me	
	}
	
	public void viewStudentSchedule() {
		// TODO implement me	
	}
	
	public void postNews() {
		// TODO implement me	
	}
	
	public void removeNews() {
		// TODO implement me	
	}
}
