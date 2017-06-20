package by.bsu.students.application.Entity;

public class User implements Comparable{

	protected String password;
	protected String username;
	protected Role role;

	public void finalize() throws Throwable {

	}

	public User() {

	}

	/**
	 * 
	 * @param password
	 * @param username
	 */
	public User(String username, String password){
		this.username = username;
		this.password = password;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof User) {
			return (username.equals(((User) obj).username) && password.equals(((User) obj).password));
		}
		else return super.equals(obj);
	}

	@Override
	public int compareTo(Object obj) {
		int nameComp = username.compareTo(((User) obj).username);
		if (nameComp == 0)
			return password.compareTo(((User) obj).password);
		else
			return nameComp;
	}

	public String getUsername() {
		return username;
	}

	public Role getRole() {
		return role;
	}
}