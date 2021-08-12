/*
El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:

El usuario proporcionará un valor entre 0 y 10.
Si está entre 9 y 10: imprimir una A
Si está entre 8 y menor a 9: imprimir una B
Si está entre 7 y menor a 8: imprimir una C
Si está entre 6 y menor a 7: imprimir una D
Si está entre 0 y menor a 6: imprimir una F
cualquier otro valor debe imprimir: Valor desconocido
 */

import javax.swing.*;

public class ejercicio7 {
    public static void main(String[] args) {
        float pregunta;
        String letra = null, msj = "numero no encontrado";

        pregunta = Float.parseFloat(JOptionPane.showInputDialog("digite un numero entre 0 y 10"));
        switch ((int) pregunta) {
            case 9: case 10:
                letra = "A";
                break;
            case 8:
                letra = "B";
                break;
            case 7:
                letra = "C";
                break;
            case 6:
                letra = "D";
                break;
            case 5: case 4: case 3: case 2: case 1: case 0:
                letra = "E";
                break;
            default:
                msj = "letra no encontrada";
                break;
        }

        System.out.println("La letra correspondiente es: " + msj);


    }
}
