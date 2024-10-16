package co.edu.uniquindio.poo.model;

public enum TipoCombustible {

    GASOLINA, DIESEL, ELECTRICO,  HIBRIDO;

    /*
     * Metodo que retorna el tipo de combustible
     */
    public static TipoCombustible getTipoCombustible(String tipo) {
        switch (tipo) {
            case "GASOLINA":
                return GASOLINA;
            case "DIESEL":
                return DIESEL;
            case "ELECTRICO":
                return ELECTRICO;
            case "HIBRIDO":
                return HIBRIDO;
            default:
                return null;
        }
    }

    /*
     * Metodo que retorna el tipo de combustible
     */
    public static String getTipoCombustible(TipoCombustible tipo) {
        switch (tipo) {
            case GASOLINA:
                return "GASOLINA";
            case DIESEL:
                return "DIESEL";
            case ELECTRICO:
                return "ELECTRICO";
            case HIBRIDO:
                return "HIBRIDO";
            default:
                return null;
        }
    }
    
}
