package co.edu.uniquindio.poo.model;

public class Carro extends Vehiculo{

    private byte numeroPuertas,numeroPasajeros;

    /*
     * Constructor de la clase Carro
     */
    public Carro(String marca, String modelo, String placa, String cilindraje, double precio, double velocidadMaxima, byte cambios, byte numeroPuertas, byte numeroPasajeros) {
        super(marca, modelo, placa, cilindraje, precio, velocidadMaxima, cambios);
        this.numeroPuertas = numeroPuertas;
        this.numeroPasajeros = numeroPasajeros;
    }

    /*
     * Getters y Setters
     */
    public byte getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(byte numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public byte getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(byte numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    
}
