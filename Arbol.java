package ejercicioplanta;

public class Arbol extends Planta {
    
    private String variedad;
    private String tipoTronco;
    private double radioTronco;
    private String color;
    private String tipoHojas;

    @Override
    protected void mostrarMensaje() {
        System.out.println("Hola soy un arbol");
    }
    
}
