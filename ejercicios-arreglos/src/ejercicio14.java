/*
    Leer dos series de 10 numeros enteros, que estaran ordenados
    crecientemente. fusionar las dos tablas  en una tercera,
    de forma que sigan ordenados
*/
import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int arreglo1[] = new int[10];
        int arreglo2[] = new int[10];
        int arreglofinal[] = new int[20];
        boolean creciente = true;

        do {
            System.out.println("Arreglo 1");
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + " ingrese 10 numeros ordenados para la primera tabla ");
                arreglo1[i] = entrada.nextInt();
            }

            // comprobamos si el arreglo esta ordenado
            for (int i = 0; i < 9; i++) {
                if (arreglo1[i] < arreglo1[i + 1]) { // creciente
                    creciente = true;
                }
                if (arreglo1[i] > arreglo1[i + 1]) {
                    creciente = false;
                    break;
                }
            }
            if (creciente == false) {
                System.out.println("\n El arreglo esta desordenado vuelva a digitar");
            }
        } while (creciente == false); // si esta desordenado nuevamente toca digitar el arreglo

        do {
            System.out.println("Arreglo 2");
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + " ingrese 10 numeros ordenados para la segunda tabla ");
                arreglo2[i] = entrada.nextInt();
            }
            // comprobamos si el arreglo esta ordenado
            for (int i = 0; i < 9; i++) {
                if (arreglo2[i] < arreglo2[i + 1]) { // creciente
                    creciente = true;
                }
                if (arreglo2[i] > arreglo2[i + 1]) {
                    creciente = false;
                    break;
                }
            }
            if (creciente == false) {
                System.out.println("\n El arreglo esta desordenado vuelva a digitar");
            }
        } while (creciente == false);

        int i = 0; // iterador para el arreglo 1
        int j = 0; // iterador para el arreglo 2
        int k = 0; // iterador para el arreglo final

        while (i < 10 && j < 10) {
            if (arreglo1[i] < arreglo2[j]) { // si el numero del arreglo 1 es mayor al del arreglo 2
                arreglofinal[k] = arreglo1[i]; // la posicion k toma el valor de la posicion i
                i++; // avanzamos una posicion en el arreglo 1
            } else {
                arreglofinal[k] = arreglo2[j];
                j++; // avanzamos una posicion en el arreglo 2
            }
            k++; // avanzamos una posicion en el arreglo k
        }

        // cuando salimos del while es porque un arreglo se a copiado completamente
        if (i == 10) { // significa que ya copiamos todo el arreglo 1 falta el arreglo 2
            while (j < 10) {
                arreglofinal[k] = arreglo2[j];
                j++;
                k++;
            }
        } else { // significa que ya copiamos todo el arreglo 2 falta el arreglo 1
            while (i < 10) {
                arreglofinal[k] = arreglo1[i];
                i++;
                k++;
            }
        }
        System.out.println("\n el arreglo final es: ");
        for (k = 0; k < 20; k++) {
            System.out.print(arreglofinal[k] + " - ");
        }
        System.out.println("");
    }
}
