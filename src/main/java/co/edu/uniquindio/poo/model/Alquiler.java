package co.edu.uniquindio.poo.model;

import java.util.Date;

public class Alquiler {

    private Date fechaInicio, fechaFin;
    private String id;
    private double valorAlquiler;
    private Vehiculo vehiculo;
    private Empleado empleado;
    private Cliente cliente;

    /*
     * Constructor de la clase Alquiler
     */
    public Alquiler(Date fechaInicio, Date fechaFin,String id, double valorAlquiler, Vehiculo vehiculo, Empleado empleado, Cliente cliente) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.id = id;
        this.valorAlquiler = valorAlquiler;
        this.vehiculo = vehiculo;
        this.empleado = empleado;
        this.cliente = cliente;
    }

    /*
     * Getters y Setters
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public double getValorAlquiler() {
        return valorAlquiler;
    }

    public void setValorAlquiler(double valorAlquiler) {
        this.valorAlquiler = valorAlquiler;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
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

}
