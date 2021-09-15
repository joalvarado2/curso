/*
    ordenar dos arreglos y unirlos un una sola de manera ordenada
*/
import java.util.Arrays;

public class ejercicio15 {
    public static void main(String[] args) {
        int a[] = {1, 9, 3, 5, 7, 11, 15, 17, 13};
        int b[] = {4, 6, 10, 2, 8, 14, 12, 18, 16};
        int c[] = new  int[15];

        Arrays.sort(a);
        System.out.println("Arreglo 1 ordenado \n"+Arrays.toString(a));
        Arrays.sort(b);
        System.out.println("Arreglo 2 ordenado \n"+Arrays.toString(b));

        int i = 0; // iterador para el arreglo 1
        int j = 0; // iterador para el arreglo 2
        int k = 0; // iterador para el arreglo final

        // Uniendo dos arrays en uno
        while (i < 8 ) {
            if (a[i] < b[j]) { // si el numero del arreglo 1 es mayor al del arreglo 2
                c[k] = a[i]; // la posicion k toma el valor de la posicion i
                i++; // avanzamos una posicion en el arreglo 1
            } else {
                c[k] = b[j];
                j++; // avanzamos una posicion en el arreglo 2
            }
            k++; // avanzamos una posicion en el arreglo k
        }

        System.out.println(Arrays.toString(c));
    }

}

