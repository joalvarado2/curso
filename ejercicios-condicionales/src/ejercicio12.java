import javax.swing.*;

public class ejercicio12 {
    /*
        pedir tres numeros y mostrarlos ordenados de mayor a menor
    */
    public static void main(String[] args) {
        int num1, num2, num3;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("ingresa el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo numero"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("ingresa el ultimo numero"));

        if(num1 > num2 && num2 > num3){
            JOptionPane.showMessageDialog(null,"el orden de los numero digitados son " + num1 + ", "+ num2 + ", "+ num3);
        } else if(num1 > num3 &&  num3 > num2){
            JOptionPane.showMessageDialog(null,"el orden de los numero digitados son " + num1 + ", "+ num3 + ",  "+ num2);
        } else if(num2 > num1 && num1 > num3){
            JOptionPane.showMessageDialog(null,"el orden de los numero digitados son " + num2 + ", "+ num1 + ",  "+ num3);
        } else if(num2 > num3 && num3 > num1){
            JOptionPane.showMessageDialog(null,"el orden de los numero digitados son " + num2 + ", "+ num3 + ",  "+ num1);
        } else if(num3 > num1 && num1 > num2){
            JOptionPane.showMessageDialog(null,"el orden de los numero digitados son " + num3 + ", "+ num1 + ",  "+ num2);
        } else if(num3 > num2 && num2 > num1){
            JOptionPane.showMessageDialog(null,"el orden de los numero digitados son " + num3 + ", "+ num2 + ",  "+ num1);
        }
    }
}
