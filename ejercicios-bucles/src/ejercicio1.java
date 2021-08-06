import javax.swing.*;

public class ejercicio1 {
    /*
        Leer un numero e indicar si es positivo o negativo.
        el proceso se repetira hasta que se introduzca un 0
    */
    public static void main(String[] args) {
        int num = 0 ,i = 0;
        
        while (i == num){
            num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        } i++;
    }
}
