package co.edu.uniquindio.poo.model;

public class Bus extends Carro {

    private double capacidadMaletero;
    private byte numeroEjes,numeroSalidasEmergencia;

    /*
     * Constructor de la clase Bus
     */
    public Bus(String marca, String modelo, String placa, String cilindraje, double precio, double velocidadMaxima, byte cambios, byte numeroPuertas, byte numeroPasajeros, double capacidadMaletero, byte numeroEjes, byte numeroSalidasEmergencia) {
        super(marca, modelo, placa, cilindraje, precio, velocidadMaxima, cambios, numeroPuertas, numeroPasajeros);
        this.capacidadMaletero = capacidadMaletero;
        this.numeroEjes = numeroEjes;
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
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

    public byte getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(byte numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public byte getNumeroSalidasEmergencia() {
        return numeroSalidasEmergencia;
    }

    public void setNumeroSalidasEmergencia(byte numeroSalidasEmergencia) {
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    

    
}
