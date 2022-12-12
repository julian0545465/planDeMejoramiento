

import java.util.Random;


public class adivinabandera  extends inicio{

    private int eleccion2 = 0, aleatorio = 0;

    


    public adivinabandera() {
    }


    public adivinabandera(String nombre, String apellido, int edad, String correo, int eleccion2) {
        super(nombre, apellido, edad, correo);
        this.eleccion2 = eleccion2;
    }


    public void adivinarBandera(){
        Random random = new Random();
        aleatorio = 1+random.nextInt(2);

        switch(aleatorio){
            case 1:
            System.out.println("");
            System.out.println("Adivina la bandera (Polonia)");
            System.out.println("");
            System.out.println("Ingrese una opcion \n Ingrese 1 para elegir Polonia \n Ingrese 2 para elegir Monaco \n Ingrese 3 para elegir Chile");
            eleccion2 = in.nextInt();
            switch(eleccion2){
              
                case 1: System.out.println("Felicidades, correcta");
                System.out.println("---------------------------------------------------");

                break;
                case 2: 
                System.out.println("Lo siento has perdido");
                System.exit(0);

                break;
                case 3:
                System.out.println("Lo siento has perdido");
                System.exit(0);
                break;
            }
            case 2:
            System.out.println("");
            System.out.println("Adivina la bandera (Croacia)");
            System.out.println("");
            System.out.println("Ingrese una opcion \n Ingrese 1 para elegir Rusia \n Ingrese 2 para elegir Eslovaquia \n Ingrese 3 para elegir Croacia");
            eleccion2 = in.nextInt();
            switch(eleccion2){
                case 1: 
                System.out.println("Lo siento has perdido");
                System.exit(0);
                break;
                case 2: 
                System.out.println("Lo siento has perdido");
                System.exit(0);
                break;
                case 3: System.out.println("Felicidades, correcta");
                System.out.println("---------------------------------------------------");

                break;


            }
            case 3:
            System.out.println("");
            System.out.println("Adivina la bandera (Holanda)");
            System.out.println("");
            System.out.println("Ingrese una opcion \n Ingrese 1 para elegir Tailandia \n Ingrese 2 para elegir Holanda \n Ingrese 3 para elegir Francia");
            eleccion2 = in.nextInt();
            switch(eleccion2){
                case 1: 
                System.out.println("Lo siento has perdido");
                System.exit(0);
                break;
                case 2: System.out.println("Felicidades, correcta");
                System.out.println("---------------------------------------------------");

                break;
                case 3:
                System.out.println("Lo siento has perdido");
                System.exit(0);
                break;


            }
            case 4:
            System.out.println("");
            System.out.println("Adivina la bandera (Gales)");
            System.out.println("");
            System.out.println("Ingrese una opcion \n Ingrese 1 para elegir Ucrania \n Ingrese 2 para elegir Gales \n Ingrese 3 para elegir Marruecos");
            eleccion2 = in.nextInt();
            switch(eleccion2){
                case 1:
                System.out.println("Lo siento has perdido");
                System.exit(0);
                break;
                case 2: System.out.println("Felicidades, correcta");
                System.out.println("---------------------------------------------------");
                break;

                case 3: 
                System.out.println("Lo siento has perdido");
                System.exit(0);
                break;


            }
            case 5:
            System.out.println("");
            System.out.println("Adivina la bandera (Butan)");
            System.out.println("");
            System.out.println("Ingrese una opcion \n Ingrese 1 para elegir Butan \n Ingrese 2 para elegir Dominica \n Ingrese 3 para elegir Granada");
            eleccion2 = in.nextInt();
            switch(eleccion2){
                case 1: System.out.println("Felicidades, correcta");
                System.out.println("---------------------------------------------------");
                System.out.println("");

                break;
                case 2:
                System.out.println("Lo siento has perdido");
                System.exit(0);
                break;
                case 3:
                System.out.println("Lo siento has perdido");
                System.exit(0);
                break;


            }
            System.out.println("---------------FELICITACIONES GANASTE--------------------");
            System.out.println("Las banderas que adivinaste fueron \n Polonia \n Croacia \n Holanda \n Gales \n Butan");
            System.out.println("");
         }

    }
}
    

    
    

