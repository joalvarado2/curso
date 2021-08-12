import javax.swing.*;
import java.util.Locale;

public class ejercicio15 {
    /*
        Contruir un programa que simule el funcionamiento de una calculadora que pueda realizar las 4 operaciones basicas.
        (suma, resta, multiplicacion, division) con valores numericos enteros.
        el usuario debe especificar que tipo de operacion basica quiere realizar con el primer caracter de comandos
        Suma, Resta, Multiplicacion, Division.
    */
    public static void main(String[] args) {
        int num1, num2, total;
        String comando;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el otro numero"));
        comando = JOptionPane.showInputDialog("ingrese la operacion que desea hacer S suma, R resta, M multiplicacion, D division");

        switch (comando) {
            case "S":
            case "s":
                total = num1 + num2;
                JOptionPane.showMessageDialog(null, "la suma es " + total);
                break;
            case "R":
            case "r":
                total = num1 - num2;
                JOptionPane.showMessageDialog(null, "la resta es " + total);
                break;

            case "M":
            case "m":
                total = num1 * num2;
                JOptionPane.showMessageDialog(null, "la multiplicacion es " + total);
                break;

            case "D":
            case "d":
                total = num1 / num2;
                JOptionPane.showMessageDialog(null, "la division es " + total);
                break;

            default:
                JOptionPane.showMessageDialog(null, "La letra ingresada es incorrecta");
        }
    }
}
