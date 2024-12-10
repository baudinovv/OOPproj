package Users ;

import java.util.*;

public class Organizations
{
	
	private String organizationName;
	
	private List<Student> members;
	
	private Student head;
	
	private String organizationInfo;
	
	public Organizations(String organizationName, List<Student> members, Student head, String organizationInfo){
    this.organizationName = organizationName;
    this.members = members;
    this.head = head;
    this.organizationInfo = organizationInfo;
  }
	
	public Student getHead() {
		return this.head;	
	}
	
	public String getOrganisationInfo() {
		return this.organizationInfo;	
	}

  public void setOrganizationInfo(String info){
    this.organizationInfo = info;
  }
  public void setOrganizationName(String name){
    this.organizationName = name;
  }
	
	public List<Student> getMembers() {
    return this.members;
	}
	
	public void removeMembers(Student student){
		this.members.remove(student);
	}
}
