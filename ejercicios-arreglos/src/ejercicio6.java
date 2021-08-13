import java.util.Formattable;
import java.util.Scanner;

public class ejercicio6 {
    /*
        Leer los datos correspondiente a dos tablas de 12
        elementos numericos, y mezclarlos en una tercera
        de la forma: 3 de la tabla A, tres de la tabla B,
        otros 3 de la A, otros 3 de la B, ETC.
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tablaA[] = new int[12];
        int tablaB[] = new int[12];
        int tablaC[] = new int[24];

        System.out.println("Tabla A");
        for (int i = 0; i < 12; i++) {
            System.out.print((i + 1) + " Digite un numero ");
            tablaA[i] = entrada.nextInt();
        }

        System.out.println("Tabla B");
        for (int i = 0; i < 12; i++) {
            System.out.print((i + 1) + " Digite un numero ");
            tablaB[i] = entrada.nextInt();
        }

        int j = 0;
        int i = 0;
        while (i < 12) {
            for (int k = 0; k < 3; k++) {           // por cada iteracion del while (i) se ejecuta cada for 3 veces (k)
                tablaC[j] = tablaA[i + k];
                j++;
            }
            for (int k = 0; k < 3; k++) {
                tablaC[j] = tablaB[i + k];
                j++;
            }
            i += 3;
        }
        for (int element : tablaC) {
            System.out.print(element + " ");
        }
    }
}
