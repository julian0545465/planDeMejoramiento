

import java.util.Scanner;

public class inicio {
    Scanner in = new Scanner (System.in);
    private int eleccion, edad;
    private String nombre, apellido, correo;
    

    public inicio() {
    }

    public inicio(String nombre, String apellido, int edad, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }



    public void informacionPersonal(){
        System.out.println("Cuentanos un poco de ti");
        System.out.println("Ingrese su nombre: ");
        setNombre(in.next());
        System.out.println("");
        System.out.println("Ingrese su apellido señor@ " +getNombre());
        setApellido(in.next());
        System.out.println("");
        System.out.println("Ingrese su edad señor@ " +getNombre()+ " "+getApellido());
        setEdad(in.nextInt());
        System.out.println("");
        System.out.println("Por ultimo, Ingrese su correo");
        setCorreo(in.next());
        System.out.println("");
        System.out.println("Gracias por la informacion");
        System.out.println("------------------------------------------------------------------------------------");


      

    }

    public void seleccionarAvatar(){
        System.out.println("");
        System.out.println("Bienvenido al juego adivina la bandera");
        System.out.println("Escoja un avatar \n Ingresar el numero 1 para elegir a Azula \n Ingresar el numero 2 para elegir a Zuko \n Ingresar el numero 3 para elegir a Sokka");
        eleccion = in.nextInt();
        System.out.println("");
        if(eleccion == 1){
            System.out.println("Has elegido a Azula ");
            System.out.println("");
            System.out.println("Personalidad cruel, y casi no mostró empatía o remordimiento por acciones que dañaban a otros tanto física como emocionalmente.");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        else if (eleccion == 2){
            System.out.println("Has elegido a Zuko ");
            System.out.println("");
            System.out.println("Paciente y dedicado, tiene una personalidad fría. Él cree que una persona se vuelve fuerte teniendo que esforzarse y peleando por lo que quiere.");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        else if (eleccion == 3){{
            System.out.println("Has elegido a Soka ");
            System.out.println("");
            System.out.println("Sokka suele ser bastante testaruda y escéptica (especialmente en cuestiones místicas y espirituales). Es el tipo que suele pensar que hay que ver para creer.");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
    

}


}

