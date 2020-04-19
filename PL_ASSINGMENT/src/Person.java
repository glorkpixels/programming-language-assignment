

public abstract class Person {

	
	private String name;
	private String surname;
	private String email;
	private String birthdate;
	private boolean gender;
	public Person(String name, String surname, String email, String birthdate, boolean gender) {
		
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.birthdate = birthdate;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getEmail() {
		return email;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public boolean isGender() {
		return gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	
		
}
