package co.edu.uniquindio.poo.model;

public class Empleado extends Persona{

    private double salario;

    /*
     * Constructor de la clase Empleado
     */
    public Empleado(String nombre, String cedula, String correo, String telefono, double salario) {
        super(nombre, cedula, correo, telefono);
        this.salario = salario;
    }
    
    /*
     * Getters y Setters
     */
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
