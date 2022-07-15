package ejercicioplanta;

public class Arbusto extends Planta {
    
    private double anchoArbusto;
    private boolean esDomestico;
    private int variedadArbusto;
    private String colorHojas;
    private boolean sePodaONo;

    @Override
    protected void mostrarMensaje() {
        System.out.println("Hola soy un arbusto");
    }
    
}
