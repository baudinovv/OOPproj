package EnumsAndComparators ;




public class StudentComporator
{
	public StudentComporator(){
		super();
	}
	
	public int compareByGPA(Student s1, Student s2) {
    		return Double.compare(s1.getGPA(), s2.getGPA());
}

	public int compareByCredits(Student s1, Student s2) {
    		return Integer.compare(s1.getCredits(), s2.getCredits());
}

	public int compareByName(Student s1, Student s2) {
    		return s1.getName().compareTo(s2.getName());
}
}
