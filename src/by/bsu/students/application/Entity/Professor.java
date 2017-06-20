package by.bsu.students.application.Entity;

public class Professor extends User {

	public Professor() {
		super();
	}

	public Professor(String name, String password) {
		super(name, password);
		role = Role.Professor;
	}

	public String getLogin() {
		return username;
	}
}