package ejercicioplanta;

public class Flor extends Planta {
    
    private String colorPetalos;
    private int cantPetalos;
    private String colorPistilo;
    private int variedadFlor;
    private String estacion;

    @Override
    protected void mostrarMensaje() {
        System.out.println("Hola soy una flor");
    }
    
}
