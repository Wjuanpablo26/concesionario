package co.edu.uniquindio.poo.model;

public class Venta {

    private String fecha,id;
    private Empleado empleado;
    private Cliente cliente;
    private Vehiculo vehiculo;

    /*
     * Constructor de la clase Venta
     */
    public Venta(String fecha,String id, Empleado empleado, Cliente cliente, Vehiculo vehiculo) {
        this.fecha = fecha;
        this.id = id;
        this.empleado = empleado;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    /*
     * Getters y Setters
     */
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }


    
    
}
