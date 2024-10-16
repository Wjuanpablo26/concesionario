package co.edu.uniquindio.poo.model;

public enum TipoTransmision {
    
    MANUAL, AUTOMATICA;
    
    /*
     * Metodo que retorna el tipo de transmision
     */
    public static TipoTransmision getTipoTransmision(String tipo) {
        switch (tipo) {
            case "MANUAL":
                return MANUAL;
            case "AUTOMATICA":
                return AUTOMATICA;
            default:
                return null;
        }
    }

    /*
     * Metodo que retorna el tipo de transmision
     */
    public static String getTipoTransmision(TipoTransmision tipo) {
        switch (tipo) {
            case MANUAL:
                return "MANUAL";
            case AUTOMATICA:
                return "AUTOMATICA";
            default:
                return null;
        }
    }
    
}
