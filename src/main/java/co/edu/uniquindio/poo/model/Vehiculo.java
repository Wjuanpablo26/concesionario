package co.edu.uniquindio.poo.model;

public abstract class Vehiculo {

    private String marca,modelo,placa,cilindraje;
    private double precio,velocidadMaxima;
    private byte cambios;   

    /*
     * Constructor de la clase Vehiculo
     */
    public Vehiculo(String marca, String modelo, String placa, String cilindraje, double precio, double velocidadMaxima, byte cambios) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.precio = precio;
        this.velocidadMaxima = velocidadMaxima;
        this.cambios = cambios;
    }

    /*
     * Getters y Setters
     */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public byte getCambios() {
        return cambios;
    }

    public void setCambios(byte cambios) {
        this.cambios = cambios;
    }

    
    
}
