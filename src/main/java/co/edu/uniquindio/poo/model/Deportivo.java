package co.edu.uniquindio.poo.model;

public class Deportivo extends Carro {

    private byte bolsasAire;
    private int caballosFuerza;

    /*
     * Constructor de la clase Deportivo
     */
    public Deportivo(String marca, String modelo, String placa, String cilindraje, double precio, double velocidadMaxima, byte cambios, byte numeroPuertas, byte numeroPasajeros, byte bolsasAire, int caballosFuerza) {
        super(marca, modelo, placa, cilindraje, precio, velocidadMaxima, cambios, numeroPuertas, numeroPasajeros);
        this.bolsasAire = bolsasAire;
        this.caballosFuerza = caballosFuerza;
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

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    
    
}
