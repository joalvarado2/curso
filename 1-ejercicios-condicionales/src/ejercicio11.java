import javax.swing.*;

public class ejercicio11 {
    /*
        Hacer un programa que tome dos numeros y diga si ambos son pares o impares
    */
    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero"));

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "ambos numeros son pares");
        } else if (!(num1 % 2 == 0) && num2 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "el numero " + num1 + " es impar y el numero " + num2 + " es par");
        } else if (num1 % 2 == 0 && !(num2 % 2 == 0)) {
            JOptionPane.showMessageDialog(null, "el numero " + num1 + " es par y el numero " + num2 + " es impar");
        } else {
            JOptionPane.showMessageDialog(null,"ambos numero son impares");
        }
    }
}
