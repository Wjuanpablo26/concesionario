package co.edu.uniquindio.poo.model;

public class PickUp extends Carro {

    private byte bolsasAire;
    private double capacidadCarga;

    /*
     * Constructor de la clase PickUp
     */
    public PickUp(String marca, String modelo, String placa, String cilindraje, double precio, double velocidadMaxima, byte cambios, byte numeroPuertas, byte numeroPasajeros, byte bolsasAire, double capacidadCarga) {
        super(marca, modelo, placa, cilindraje, precio, velocidadMaxima, cambios, numeroPuertas, numeroPasajeros);
        this.bolsasAire = bolsasAire;
        this.capacidadCarga = capacidadCarga;
    }

    /*
     * Getters y Setters
     */
    public byte getBolsasAire() {
        return bolsasAire;
    }

    public void setBolsasAire(byte bolsasAire) {
        this.bolsasAire = bolsasAire;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    
    
}
