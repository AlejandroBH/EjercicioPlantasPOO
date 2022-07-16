package ejercicioplanta;

public class Arbusto extends Planta {
    
    private double anchoArbusto;
    private boolean esDomestico;
    private int variedadArbusto;
    private String colorHojas;
    private boolean sePodaONo;

    public Arbusto() {
    }

    public Arbusto(double anchoArbusto, boolean esDomestico, int variedadArbusto, String colorHojas, boolean sePodaONo, String nombre, double altoTallo, boolean tieneHojas, String clima) {
        super(nombre, altoTallo, tieneHojas, clima);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorHojas = colorHojas;
        this.sePodaONo = sePodaONo;
    }

    public double getAnchoArbusto() {
        return anchoArbusto;
    }

    public void setAnchoArbusto(double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public int getVariedadArbusto() {
        return variedadArbusto;
    }

    public void setVariedadArbusto(int variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("Hola soy un arbusto");
    }
    
}
