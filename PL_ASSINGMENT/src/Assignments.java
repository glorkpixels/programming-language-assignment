
public abstract class Assignments {
	private String assignmentName;
	private String assignmentDesc;
	private String assignmentCourse;
	private String assignmentDue;
	public Assignments(String assignmentName, String assignmentDesc, String assignmentCourse, String assignmentDue) {
		super();
		this.assignmentName = assignmentName;
		this.assignmentDesc = assignmentDesc;
		this.assignmentCourse = assignmentCourse;
		this.assignmentDue = assignmentDue;
	}
	public String getAssignmentName() {
		return assignmentName;
	}
	public String getAssignmentDesc() {
		return assignmentDesc;
	}
	public String getAssignmentCourse() {
		return assignmentCourse;
	}
	public String getAssignmentDue() {
		return assignmentDue;
	}
	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}
	public void setAssignmentDesc(String assignmentDesc) {
		this.assignmentDesc = assignmentDesc;
	}
	public void setAssignmentCourse(String assignmentCourse) {
		this.assignmentCourse = assignmentCourse;
	}
	public void setAssignmentDue(String assignmentDue) {
		this.assignmentDue = assignmentDue;
	}
	
	
	
	
}
