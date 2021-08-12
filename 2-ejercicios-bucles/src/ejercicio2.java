import javax.swing.*;

public class ejercicio2 {
    /*
        Leer los numeros hasta que se introduzca un 0. para cada uno indicar
        si es par o impar
    */
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para determinar si es par o impar"));

        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println("el numero " + num + " es par");
            } else {
                System.out.println("el numero " + num + " es impar");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para determinar si es par o impar"));
        }
    }
}
