import java.util.Scanner;

public class Cadena {


    //Realizar un programa que solicite desde teclado una cadena de caracteres, posteriormente
    //el programa debe indicar a través de un mensaje en pantalla, la cantidad de caracteres que
    // tiene dicha cadena. Finalmente el programa debe de preguntar al usuario, ¿que parte de
    //la cadena desea obtener? tal y como se vio en el ejemplo pasado.
    public static void main(String[] args) {

        String cadena_original = "", cadena_substraccion = "";
        int num_caracteres = 0, desde = 0, hasta = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce una cadena de caracteres: ");
        cadena_original = entrada.nextLine();

        num_caracteres = cadena_original.length();

        System.out.println("La cadena de caracteres " + cadena_original + " contiene una longitud de "
                + num_caracteres + " caracteres");


        System.out.print("Desde que caracter deseas tener?: ");
        desde = entrada.nextInt();

        System.out.print("Hasta que caracter deseas tener?: ");
        hasta = entrada.nextInt();

        cadena_substraccion = cadena_original.substring(desde, hasta);

        System.out.println("la cadena obtenida es " + cadena_substraccion);


    }
}
