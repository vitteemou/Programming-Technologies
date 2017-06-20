package by.bsu.students.main;

import by.bsu.students.creator.ActionFactory;

/**
 * Created by maria on 31.05.17.
 */
public class Runner {
    public static void main(String[] args) {

        ActionFactory actionFactory = new ActionFactory();
        actionFactory.createAction();
    }
}
