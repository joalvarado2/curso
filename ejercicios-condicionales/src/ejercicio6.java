/* pedir dos numeros y decir cual es el mayor o si son iguales */

import javax.swing.*;

public class ejercicio6 {
    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("digite el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("digite el segundo numero"));

        if(num1 > num2) {
            JOptionPane.showMessageDialog(null,"el numero " + num1 + " es mayor a " +num2);
        } else if(num1 == num2){
            JOptionPane.showMessageDialog(null, "los numeros ingresados son iguales");
        } else {
            JOptionPane.showMessageDialog(null, "el numero " + num1 + " es menor que " + num2);
        }

    }
}
