import java.util.Scanner;

public class ejercicio7 {
    /*
        Leer  por teclado una serie de 10 numeros enteros.
        La aplicacion de indicarnos si los numeros estan
        ordenados de forma creciente, decreciente, o si
        estan desordenados
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];
        boolean creciente = false, decreciente = false;

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " digite un numero ");
            numeros[i] = entrada.nextInt();
        }

        // Evaluamos si el arreglo ingresado es creciente, decreciente, desordenado, o igual
        for (int i = 0; i < 9; i++) {
            if (numeros[i] < numeros[i + 1]) {
                creciente = true;
            }
            if (numeros[i] > numeros[i + 1]) {
                decreciente = true;
            }
        }
        if (creciente == true && decreciente == false) {
            System.out.println("los numeros estan en orden creciente");
            for (int element : numeros) {
                System.out.print(element + " ");
            }
        } else if (creciente == false && decreciente == true) {
            System.out.println("los numeros estan ordenados en forma decreciente");
            for (int element : numeros) {
                System.out.print(element + " ");
            }
        } else if (creciente == true && decreciente == true) {
            System.out.println("los numeros estan desordenados");
            for (int element : numeros) {
                System.out.print(element + " ");
            }
        } else {
            System.out.println("los numeros del arreglo son iguales");
            for (int element : numeros) {
                System.out.print(element + " ");
            }
        }
    }
}
