package by.bsu.students.application.Boundary;

import by.bsu.students.application.Entity.Professor;

import javax.swing.*;
import java.awt.event.*;

public class ProfessorForm extends JDialog {
    private Professor professor;

    private JPanel contentPane;
    private JButton buttonCancel;
    private JButton selectCourseToTeachButton;
    private JButton submitGradesButton;

    public ProfessorForm() {
        setContentPane(contentPane);
        setModal(true);

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
        selectCourseToTeachButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }


    private void onCancel() {
// add your code here if necessary
        dispose();
    }
}
