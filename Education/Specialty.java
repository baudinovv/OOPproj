package Education ;

import java.util.Objects;

import EnumsAndComparators.Faculty;

public class Specialty
{
	
	private String id;
	
	private String name;
	
	private Course course;
	
	private String descriptions;
	
	private Faculty faculty;
	public Specialty(String id, String name, Course course, String descriptions, Faculty faculty) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.descriptions = descriptions;
        this.faculty = faculty;
    }

	public void addCourse(Course course) {
		if (course == null) {
	        throw new IllegalArgumentException("Course cannot be null");
	    }
		 System.out.println("Course successfully added to specialty: " + course.getCourseName());
    }
	
	public int compareTo(Specialty other) {
	    return Double.compare(
	        this.id != null ? this.id.hashCode() : 0,
	        other.id != null ? other.id.hashCode() : 0
	    );
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Specialty specialty = (Specialty) obj;
        
        if (id != null ? !id.equals(specialty.id) : specialty.id != null) return false;
        if (name != null ? !name.equals(specialty.name) : specialty.name != null) return false;
        if (course != null ? !course.equals(specialty.course) : specialty.course != null) return false;
        if (descriptions != null ? !descriptions.equals(specialty.descriptions) : specialty.descriptions != null) return false;
        return faculty != null ? faculty.equals(specialty.faculty) : specialty.faculty == null;
    }
	
	@Override
	public int hashCode() {
	    return Objects.hash(id, name, course, descriptions, faculty);
	}
}
