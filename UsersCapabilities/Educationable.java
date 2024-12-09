package UsersCapabilities ;

import java.util.ArrayList;

import Education.ScheduleEntry;

public interface Educationable 
{
	
	public void viewAttestation() ;
	
	public ArrayList<ScheduleEntry> viewCourseSchedule() ;
	
	public ArrayList<ScheduleEntry> viewExamsSchedule() ;
	
	public void viewJournal() ;
	
}

