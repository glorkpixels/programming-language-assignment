
public abstract class Course {
	private String courseName;
	private String courseCode;
	private String courseDesc;
	private String courseTeacher;
	public Course(String courseName, String courseCode, String courseDesc, String courseTeacher) {
		super();
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.courseDesc = courseDesc;
		this.courseTeacher = courseTeacher;
	}
	public String getCourseName() {
		return courseName;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public String getCourseDesc() {
		return courseDesc;
	}
	public String getCourseTeacher() {
		return courseTeacher;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}
	public void setCourseTeacher(String courseTeacher) {
		this.courseTeacher = courseTeacher;
	}
	
	
}
