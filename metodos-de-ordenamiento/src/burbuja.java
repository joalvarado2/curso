import javax.swing.*;
import java.util.Scanner;

public class burbuja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int arreglo[], nElementos, aux;
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de elementos del arreglo"));
        arreglo = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.print((i + 1) + " Digite un numero ");
            arreglo[i] = entrada.nextInt();
        }
        // Metodo burbuja
        for (int i = 0; i < (nElementos - 1); i++) {
            for (int j = 0; j < (nElementos - 1); j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        System.out.println("Arreglo en orden ascendente");
        for (int arr : arreglo) {
            System.out.print(arr + " - ");
        }
        System.out.println("");

        System.out.print("arreglo en orden decreciente");
        System.out.println("");
        for (int i = nElementos - 1; i >= 0; i--) {
            System.out.print(arreglo[i] + " - ");
        }
    }
}
