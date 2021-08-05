import javax.swing.*;

public class ejercicio1 {
    /*
        Leer un numero e indicar si es positivo o negativo.
        el proceso se repetira hasta que se introduzca un 0
    */
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));

        while(num != 0) {
           if(num > 0) {
               JOptionPane.showMessageDialog(null,"El numero " + num + " es positvo");
               num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
           } else {
               JOptionPane.showMessageDialog(null,"El numero " + num + " es negativo");
               num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
           }
        }
    }
}
