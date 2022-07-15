package ejercicioplanta;

public abstract class Planta {
    
    private String nombre;
    private double altoTallo;
    private boolean tieneHojas;
    private String clima;

    public Planta() {
    }

    public Planta(String nombre, double altoTallo, boolean tieneHojas, String clima) {
        this.nombre = nombre;
        this.altoTallo = altoTallo;
        this.tieneHojas = tieneHojas;
        this.clima = clima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltoTallo() {
        return altoTallo;
    }

    public void setAltoTallo(double altoTallo) {
        this.altoTallo = altoTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }
    
    protected abstract void mostrarMensaje();
    
}
