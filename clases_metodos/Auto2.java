
public class Auto2 {
    //Variables de la clase y estados
    private String sModelo;
    private int iAnho;
    private String sColor;
    int iVelMaxima;
    boolean bFull;
    String sTransmision;
    int iPuertas;
    
    //Valores por defecto para constructor (variable de clase)
    public Auto2(){
        sModelo = "Camry";
        iAnho = 2018;
        sColor = "Rojo";
    }
    
    public void MostrarCaracteristicas(){
        System.out.println("Modelo: " +sModelo);
        System.out.println("Año: " + iAnho);
        System.out.println("Velocidad máxima: " +iVelMaxima);
        System.out.println("Color: " +sColor);
        System.out.println("Cantidad de puertas: " +iPuertas);
        System.out.println("Tipo de transmisión: " +sTransmision);
        
    }
    
}