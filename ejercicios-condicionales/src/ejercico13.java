import javax.swing.*;

public class ejercico13 {
    /*
        pedir un numero entre 0 y 99.999 y decir cuantas cifras tiene
    */
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("digita un numero"));

        if(num < 10){
            JOptionPane.showMessageDialog(null, "el numero "+ num +" tiene 1 cifra");
        } else if(num < 100){
            JOptionPane.showMessageDialog(null, "el numero "+ num +" tiene 2 cifras");
        } else if(num < 1000){
            JOptionPane.showMessageDialog(null, "el numero "+ num +" tiene 3 cifras");
        } else if(num < 10000){
            JOptionPane.showMessageDialog(null, "el numero "+ num +" tiene 4 cifras");
        } else if(num < 100000){
            JOptionPane.showMessageDialog(null, "el numero "+ num +" tiene 5 cifras");
        } else {
            JOptionPane.showMessageDialog(null, "el numero excede nuestra capacidad de analisis");
        }
    }
}
