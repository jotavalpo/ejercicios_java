
public class ToyotaCanry {
    public static void main(String[] args){
    Auto Toyota = new Auto();
    
    Toyota.sModelo = "Camry";
    Toyota.iAnho = 2018;
    Toyota.iVelMaxima = 220;
    Toyota.sColor = "Rojo";
    Toyota.bFull = true;
    Toyota.sTransmision = "Manual";
    Toyota.iPuertas = 5;
    
    //Llamar al método de la clase Auto
    Toyota.MostrarCaracteristicas();
    }
}    
    
    