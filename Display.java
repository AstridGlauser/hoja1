
import java.util.Scanner;

public class Display {
    private Scanner scan = new Scanner (System.in);
    
    public int mainmenu(){//menu principal
        System.out.println("1.Encender/Apagar");
        System.out.println("2.Aumnetar Emisora");
        System.out.println("3.Disminuir Emisora");
        System.out.println("4.Cambiar tipo de frecuencia");
        System.out.println("5.Guardar Frecuencia Actual");
        System.out.println("6.Cargar Frecuencia");
        return scan.nextInt();
    }
    public int radioSelection(){//receiver para la eleccion
        System.out.println("Seleccione un slot del 1 al  12 de frecuencias guardadas");
        return scan.nextInt();
    }
    
    public void printer(String m){
        System.out.println(m);
    }
    
}
