import javax.swing.*;

public class ejercicio15 {
    /*
        Pide un numero entre 0 y 10 y mostrar la tabla de multiplicar
        de dicho numero.
    */
    public static void main(String[] args) {
        int num, total = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero mayor a 0 y menor de 10 \n para calcular su tabla de multiplicar"));
        if (num <= 0 || num > 10) {
            System.out.println("numero incorrecto");
        } else {
            for (int i = 0; i <= 10; i++) {
                total = num * i;
                System.out.println(num + " X " + i + " = " + total);
            }
        }

    }
}
