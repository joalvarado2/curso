import javax.swing.*;

public class ejercicio5 {
    /*
        pedir numeros hasta que el usuario ingrese un 0,
        mostrar la suma de todos los numeros introducidos.
    */

    public static void main(String[] args) {
        int num, contador = 0, total = 0;

        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
            total = total + num;
            contador++;
        } while(num != 0);

        System.out.println("el total de la suma de los numeros ingresados fue "+total);
    }
}
