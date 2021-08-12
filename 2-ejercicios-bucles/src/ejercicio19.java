import javax.swing.*;

public class ejercicio19 {
    /*
        Perdir 10 numeros, y mostrar al final si se ha introducido
        alguno negativo
    */
    public static void main(String[] args) {
        int num, numNegativo = 0;
        for (int i = 1; i <= 10; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero " + i));
            if (num < 0) {
                numNegativo++;
            }
        }
        if (numNegativo == 0) {
            System.out.println("no existen numeros negativos");
        } else {
            System.out.println("se han introducido " + numNegativo + " numeros negativos");
        }

    }
}
