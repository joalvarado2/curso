import javax.swing.*;

public class ejercicio3 {
    /*
        pedir numeros hasta que se teclee uno negativo, y
        mostrar cuantos numeros se han introducido
    */
    public static void main(String[] args) {
        int num, contador = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));

        while (num > 0) {
            contador++;
            num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        }
        System.out.println("se introducieron " + contador + " numeros");
    }
}
