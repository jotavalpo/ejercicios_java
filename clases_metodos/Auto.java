
public class Auto {
    //Variables de la clase y estados
    String sModelo;
    int iAnho;
    int iVelMaxima;
    String sColor;
    boolean bFull;
    String sTransmision;
    int iPuertas;

    //Método despliegue variables    
    public void MostrarCaracteristicas(){
        System.out.println("Modelo: " +sModelo);
        System.out.println("Año: " + iAnho);
        System.out.println("Velocidad máxima: " +iVelMaxima);
        System.out.println("Color: " +sColor);
        System.out.println("Cantidad de puertas: " +iPuertas);
        System.out.println("Tipo de transmisión: " +sTransmision);
        
    }
    
}