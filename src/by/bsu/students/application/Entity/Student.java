package by.bsu.students.application.Entity;

public class Student extends User {

	public Student() {
		super();
	}

	public Student(String name, String password) {
		super(name, password);
		role = Role.Student;
	}

	public String getLogin() {
		return username;
	}

}