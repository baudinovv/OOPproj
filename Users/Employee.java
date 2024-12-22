package Users ;

import java.util.List;
import java.util.Date;
import Communications.Message;
import EnumsAndComparators.Gender;

public abstract class Employee extends User
{
  private double salary;
  
  private Date hireDate;
  
  private Message message;

  public Employee(String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber){
    super(firstName, lastName, id, username, registrationDate, phoneNumber, gender, email, passportNumber);
	}

  public Employee(String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber, Date hireDate, double salary, Message message){
    super(firstName, lastName, id, username, registrationDate, phoneNumber, gender, email, passportNumber);
    this.hireDate = hireDate;
    this.salary = salary;
    this.message = message;
	}
	
  public void setHireDate(Date hireDate){
    this.hireDate = hireDate;
  }
  public void setSalary(double salary){
    this.salary = salary;
  }
  public void SetMessage(Message message){
    this.message = message;
  }

  public Date getHireDate() {
      return hireDate;
  }

  public double getSalary() {
      return salary;
  }

  public Message getMessage() {
      return message;
  }

  @Override
  public String toString() {
    return "Employee{" +
      "salary=" + salary +
      ", hireDate=" + hireDate +
      ", message=" + message +
      ", " + super.toString() +
      '}';
  }


}
