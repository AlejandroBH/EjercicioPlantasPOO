package ejercicioplanta;

public class Flor extends Planta {
    
    private String colorPetalos;
    private int cantPetalos;
    private String colorPistilo;
    private int variedadFlor;
    private String estacion;

    public Flor() {
    }

    public Flor(String colorPetalos, int cantPetalos, String colorPistilo, int variedadFlor, String estacion, String nombre, double altoTallo, boolean tieneHojas, String clima) {
        super(nombre, altoTallo, tieneHojas, clima);
        this.colorPetalos = colorPetalos;
        this.cantPetalos = cantPetalos;
        this.colorPistilo = colorPistilo;
        this.variedadFlor = variedadFlor;
        this.estacion = estacion;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public int getCantPetalos() {
        return cantPetalos;
    }

    public void setCantPetalos(int cantPetalos) {
        this.cantPetalos = cantPetalos;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public int getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(int variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("Hola soy una flor");
    }
    
}
