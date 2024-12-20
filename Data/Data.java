package Data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.sql.DataSource;

import org.postgresql.ds.PGSimpleDataSource;

import Education.Course;
import Users.*;

public class Data
{
  private static String filePath = "C:\\Users\\alish\\OneDrive\\Рабочий стол";
	public static Vector<Student> students = new Vector<Student>();
	public static Vector<Teacher> teachers = new Vector<Teacher>();
	public static Vector<Manager> managers = new Vector<Manager>();
	public static Vector<Course> courses = new Vector<Course>();
	// ...
	
	public static void saveTeachers() {
		Data.serialize(teachers, "teachers.txt");
	}
	
	public static void serialize(Object data, String fileName) {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(getFilePath() + fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(data);
			
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Object deserialize(String fileName) {
		FileInputStream fis;
		try {
			fis = new FileInputStream(getFilePath() + fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object result = ois.readObject();
			
			ois.close();
			
			return result;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
  
	public static String getFilePath() {
		return filePath;
	}  
}
