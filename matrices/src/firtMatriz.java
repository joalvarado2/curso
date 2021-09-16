import javax.swing.*;
import java.util.Scanner;

public class firtMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas,nColumnas;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas"));

        matriz = new int[nFilas][nColumnas];


        // ingresando datos a la matriz
        System.out.println("Digite la matriz");
        for(int i = 0; i < nFilas; i++){
            for(int j = 0; j < nColumnas; j++){
                System.out.print("Matriz ["+i+"]"+"["+j+"]");
                matriz[i][j] = entrada.nextInt();
            }
        }

        // mostrando la matriz
        System.out.println("\nLa matriz es:");
        for (int i = 0; i < nFilas; i++){ // numero de filas
            for (int j = 0; j < nColumnas; j++){ // numero de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
