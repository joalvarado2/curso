import javax.swing.*;

public class ejercicio9 {
    /*
        pedir 10 numeros y escribir la suma total
    */
    public static void main(String[] args) {
        int suma = 0, num;
        for(int i = 1; i <= 10; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
            suma += num;
        }
        System.out.println("la suma de todos los valores es "+suma);
    }
}
