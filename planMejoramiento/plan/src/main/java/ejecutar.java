
import java.util.Scanner;

public class ejecutar {
    public static void main(String[] args) {
        adivinabandera a = new adivinabandera();
        int repeat = 1;
        Scanner in  = new Scanner(System.in);
        a.informacionPersonal();
        while(repeat == 1){
        a.seleccionarAvatar();
        a.adivinarBandera();

        System.out.println("Ingresar 1 para volver a jugar");
        System.out.println("Ingresar 2 para salir del juego");
        repeat = in.nextInt();

        }
        in.close();
        
    }
    
}
