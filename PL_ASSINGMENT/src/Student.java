import java.util.ArrayList;
import java.util.List;

public class Student extends Person  {
	
	
	private String username;
	private String password;
	static List<String> courseList = new ArrayList<String>();
	
	
	public Student(String name, String surname, String email, String birthdate, boolean gender, String username,
			String password) {
		super(name, surname, email, birthdate, gender);
		this.username = username;
		this.password = password;
	}
	
	public void addCourse(String course) {
		courseList.add(course);
	}


	public String getUsername() {
		return username;
	}


	public String getPassword() {
		return password;
	}


	public static List<String> getCourseList() {
		return courseList;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public static void setCourseList(List<String> courseList) {
		Student.courseList = courseList;
	}
	
	
	


}
