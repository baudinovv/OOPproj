package Users ;

import java.util.*;

public class Book
{
	
	private String bookName;
	
	private String author;
	
	private int bookId;
	
	private User owner;
	
	private Date tookDate;

	public Book(String bookName, String author, int bookId, User owner, Date tookDate){
		this.bookName = bookName;
    this.author = author;
    this.bookId = bookId;
    this.owner = owner;
    this.tookDate = tookDate;
	}
	
	public boolean isBookAvailable() {
		if(owner == null){
      return true;
    } else {
      return false;
    }
	}
}
