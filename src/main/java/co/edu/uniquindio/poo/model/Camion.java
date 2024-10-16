package co.edu.uniquindio.poo.model;

public class Camion extends Vehiculo {
    
    private byte numeroEjes;
    private String tipoCamion;
    
    /*
     * Constructor de la clase Camion
     */
    public Camion(String marca, String modelo, String placa, String cilindraje, double precio, double velocidadMaxima, byte cambios, byte numeroEjes, String tipoCamion) {
        super(marca, modelo, placa, cilindraje, precio, velocidadMaxima, cambios);
        this.numeroEjes = numeroEjes;
        this.tipoCamion = tipoCamion;
    }

    /*
     * Getters y Setters
     */
    public byte getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(byte numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public String getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    
}
