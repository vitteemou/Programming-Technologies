package by.bsu.students.application.Entity;

import java.util.TreeSet;

public class DataBase {

	private static DataBase instance;

	private TreeSet<User> database;
	private DataBase(){
		database = new TreeSet<User>();
		database.add(new Registrar("registrar", "111111"));
		database.add(new Professor("professor", "111111"));
		database.add(new Student("student", "111111"));
	}

	public static DataBase getInstance() {
		if (instance == null)
			instance = new DataBase();
		return instance;
	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param user
	 */
	public Role authenticate(User user){
		if (database.contains(user))
			return database.ceiling(user).getRole();
		return null;
	}

	public User getUser(User user) {
		return database.ceiling(user);
	}

}