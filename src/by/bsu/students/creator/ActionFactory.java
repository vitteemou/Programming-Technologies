package by.bsu.students.creator;

import by.bsu.students.application.Boundary.LoginForm;

import javax.swing.*;
import java.util.Map;

/**
 * Created by maria on 31.05.17.
 */
public class ActionFactory {
    private Map<String, Action> actions;
    public static void createAction(){
        LoginForm dialog = new LoginForm();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
