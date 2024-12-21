package Data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;

import javax.sql.DataSource;

import org.postgresql.ds.PGSimpleDataSource;

import Controllers.UserController;
import Education.Course;
import Users.*;

public class Data {
  private static String filePath = "C:\\Users\\alish\\OneDrive\\Рабочий стол";
  public static Vector<Student> students = new Vector<Student>();
  public static Vector<Teacher> teachers = new Vector<Teacher>();
  public static Vector<Manager> managers = new Vector<Manager>();
  public static Vector<Course> courses = new Vector<Course>();
  // ...

  public String hashPassword(String passwordToHash){
    String generatedPassword = null;
    try{
      // Create MessageDigest instance for MD5
      MessageDigest md = MessageDigest.getInstance("MD5");

      // Add password bytes to digest
      md.update(passwordToHash.getBytes());

      // Get the hash's bytes
      byte[] bytes = md.digest();

      // This bytes[] has bytes in decimal format. Convert it to hexadecimal format
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < bytes.length; i++) {
        sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
      }

      // Get complete hashed password in hex format
      generatedPassword = sb.toString();
      return generatedPassword;
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
      return "";
    }
  }

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


  private DataSource createDataSource(){
    final String url =
     "jdbc:postgresql://localhost:5432/wsp?user=postgres&password=postgres";
    final PGSimpleDataSource dataSource = new PGSimpleDataSource();
    dataSource.setURL(url);
    return dataSource;
  }

  public void getUsers(Connection conn ) throws SQLException {
    PreparedStatement stat = conn.prepareStatement("select * from users");
    ResultSet rs = stat.executeQuery();
    
    while (rs.next()) {
      System.out.println(rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
    }
    
  }

  public Boolean checkPassword(Connection conn , String username , String password) throws SQLException {
    PreparedStatement stat = conn.prepareStatement("select password from users where username=?");
    stat.setString(1, username);
    ResultSet rs = stat.executeQuery();
    
    while (rs.next()) {
      return rs.getString(1).equals(hashPassword(password));
    }

    return false;
  }

  public static String checkRole(Connection conn , String username) throws SQLException {
    PreparedStatement stat = conn.prepareStatement("select role from users where username=?");
    stat.setString(1, username);
    ResultSet rs = stat.executeQuery();
    
    while (rs.next()) {
      return rs.getString(1);
    }

    return "";
  }

}
