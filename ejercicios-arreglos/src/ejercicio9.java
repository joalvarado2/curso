import java.util.Scanner;

/*
    Crear un programa que lea por teclado una tabla de 10 numeros enteros
    y lo desplace una posicion hacia abajo: el primero pasa a ser el segundo,
    el segundo pasa a ser el tercero y asi sucesivamente. el ultimo pasa a ser el primero.
*/
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabla[] = new int[10];
        int numero;

        System.out.println("Guardando elementos de para el arreglo");

        for (var i = 0; i < 10; i++) {
            System.out.print("ingrese el numero " + (i + 1) + " ");
            tabla[i] = entrada.nextInt();
        }
        numero = tabla[9];

        // procedemos a desplazar las posiciones del arreglo
        for (var i = 8; i >= 0; i--) {
            tabla[i + 1] = tabla[i];
        }
        tabla[0] = numero;

        for (int element : tabla) {
            System.out.print(element + " ");
        }

    }
}
