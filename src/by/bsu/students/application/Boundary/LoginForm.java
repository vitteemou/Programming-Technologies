package by.bsu.students.application.Boundary;

import by.bsu.students.application.Controller.LoginController;
import by.bsu.students.application.Entity.*;

import javax.swing.*;
import java.awt.event.*;

public class LoginForm extends JDialog {
    public LoginController m_DBConnector;
    private JPanel contentPane;
    private JButton buttonSign;
    private JButton buttonCancel;
    private JTextField passwordField;
    private JTextField loginField;
    private JLabel errorField;

    public LoginForm() {
        errorField.setVisible(false);
        m_DBConnector = LoginController.getInstance();

        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonSign);

        buttonSign.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

// call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
// add your code here
        Role role = m_DBConnector.authenticate(new User(loginField.getText(), passwordField.getText()));
        if (role == null) {
            errorField.setText("Invalid data. Check username or password.");
            errorField.setVisible(true);
        }
        else
            showForm(role, new User(loginField.getText(), passwordField.getText()));
    }

    public void showForm(Role role, User user) {
        errorField.setVisible(false);
        switch (role) {
            case Registrar:
                RegistrarForm dialog = new RegistrarForm();
                dialog.pack();
                dialog.setVisible(true);
                break;
            case Student:
                StudentForm studentForm = new StudentForm();
                studentForm.pack();
                studentForm.setVisible(true);
                break;
            case Professor:
                ProfessorForm professorForm = new ProfessorForm();
                professorForm.pack();
                professorForm.setVisible(true);
                break;
        }
    }

    private void onCancel() {
// add your code here if necessary
        dispose();
    }
}
