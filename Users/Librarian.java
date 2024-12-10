package Users ;

import EnumsAndComparators.Gender;
import java.util.*;

public class Librarian extends Employee
{
	
	private int librarianId;

	public Librarian(String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber){
		super(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);
	}
	public Librarian(String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber, int librarianId){
		super(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);
    this.librarianId = librarianId;
	}
	
  public void setLibrarianId(int librarianId){
    this.librarianId = librarianId;
  }

	public void notifyReaders() {
		// TODO implement me	
	}
	
	public void showMenu() {
		// TODO implement me	
	}
	
	public Book addBook(String bookName, String author, int bookId, User owner, Date tookDate) {
		return new Book( bookName,  author,  bookId,  owner,  tookDate);
	}
	
	public void removeBook(Book book) {
		book = null;
	}
	
	public void notifySubcribers() {
		// TODO implement me	
	}
}
