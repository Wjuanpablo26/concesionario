package co.edu.uniquindio.poo.model;

public class Camioneta extends Carro {
    
    private double capacidadMaletero;

    /*
     * Constructor de la clase Camioneta
     */
    public Camioneta(String marca, String modelo, String placa, String cilindraje, double precio, double velocidadMaxima, byte cambios, byte numeroPuertas, byte numeroPasajeros, double capacidadMaletero) {
        super(marca, modelo, placa, cilindraje, precio, velocidadMaxima, cambios, numeroPuertas, numeroPasajeros);
        this.capacidadMaletero = capacidadMaletero;
    }

    /*
     * Getters y Setters
     */
    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    
}
