package by.bsu.students.application.Controller;

import by.bsu.students.application.Entity.*;

/**
 * Created by maria on 31.05.17.
 */

public class LoginController {

    private static LoginController instance;

	public DataBase m_UsersDB;
	private LoginController(){
		m_UsersDB = DataBase.getInstance();
	}

    public static LoginController getInstance() {
        if (instance == null)
            instance = new LoginController();
        return instance;
    }

	public void finalize() throws Throwable {

	}

	/**
	 *
     * @param user
     */
	public Role authenticate(User user){
		return m_UsersDB.authenticate(user);
	}

	/**
	 * 
	 * @param user
	 */
	public void createProfessor(User user){

	}

	/**
	 * 
	 * @param prof
	 */
	public void createProfessorCourseList(Professor prof){

	}

	public void deleteProfessor(){

	}

	public void deleteSchedule(){

	}

	public User getUser(User user) {
		return m_UsersDB.getUser(user);
	}
}