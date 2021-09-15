import java.util.Scanner;

public class ejercicio4 {
    /*
        Leer 10 numeros enteros, guardarlos en un arreglo.
        Debemos mostrarlos en el siguiente orden: el primero, el ultimo
        el segundo, el penultimo, el tercero;
        ejemplo se ingresa [22,36,85,96,12,35] se debe imprimir [22,35,36,12,85,96]
    */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int enteros[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " Digite la serie de numeros ");
            enteros[i] = entrada.nextInt();
        }
        System.out.println("la lista del arreglo que asi: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(enteros[i] + " ");
            System.out.print(enteros[9 - i] + " ");
        }
    }
}
