package co.edu.uniquindio.poo.model;

public class Administrador extends Empleado {

    private String user, password;

    /*
     * Constructor de la clase Administrador
     */
    public Administrador(String nombre, String cedula, String correo, String telefono, double salario, String user,String password) {
        super(nombre, cedula, correo, telefono, salario);
        this.user = user;
        this.password = password;
    }

    /*
     * Getters y Setters
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
