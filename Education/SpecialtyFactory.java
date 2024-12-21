package Education;

import EnumsAndComparators.Faculty;
import java.util.Scanner;

public class SpecialtyFactory {


    public SpecialtyFactory() {
        super();
    }

   
    public Specialty createSpecialty() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Specialty ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Specialty Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Specialty Description: ");
        String description = scanner.nextLine();

        System.out.print("Enter Faculty (SITE, SG, BS, ISE, SAM, KMA, SCE): ");
        Faculty faculty = Faculty.valueOf(scanner.nextLine().toUpperCase());

        System.out.println("Enter Course Details:");
        System.out.print("Course ID: ");
        String courseId = scanner.nextLine();

        System.out.print("Course Name: ");
        String courseName = scanner.nextLine();

        System.out.print("Course Credits: ");
        int credits = scanner.nextInt();

        Course course = new Course(courseId, courseName, credits, courseName, null, null, null);

        return new Specialty(id, name, course, description, faculty);
    }
}
