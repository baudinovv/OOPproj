package EnumsAndComparators ;


public class CourseComporator
{
	public CourseComporator(){
		super();
	}
	
	public int compareByCode(Course c1, Course c2) {
   		return c1.getCode().compareTo(c2.getCode());
}

	public int compareByCredits(Course c1, Course c2) {
    		return Integer.compare(c1.getCredits(), c2.getCredits());
}

	public int compareByEnrollment(Course c1, Course c2) {
    		return Integer.compare(c1.getEnrollment(), c2.getEnrollment());
}
}
