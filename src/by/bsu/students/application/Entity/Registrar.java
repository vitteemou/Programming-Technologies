package by.bsu.students.application.Entity;

public class Registrar extends User {
    public Registrar() {
        super();
    }

    public Registrar(String name, String password) {
        super(name, password);
        role = Role.Registrar;
    }

    public String getLogin() {
        return username;
    }
}
