import java.util.Scanner;

public class ejercicio1 {
    /*
        Leer 5 numeros, guardalos en un arreglo y
        mostrarlos en el mismos orden introducido
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];             // Declaramos el arreglo con sus posiciones

        System.out.println("guardando datos del arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " Digite un numero ");
            numeros[i] = entrada.nextFloat();       // por cada posicion en mi arreglo guardamos el valor ingresado
        }

        System.out.println("imprimiendo los numeros del arreglo");
        for (float element : numeros) {
            System.out.println(element);
        }
    }
}
