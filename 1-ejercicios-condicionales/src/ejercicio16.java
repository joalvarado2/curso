import javax.swing.*;

public class ejercicio16 {
    /*
        hacer un programa que simule un cajero automatico con un saldo inicial de 1000 dolares.
        con el siguiente menu de opciones:
        1. ingrese dinero a la cuenta
        2. retirar dinero de la cuenta
        3. salir
    */
    public static void main(String[] args) {
        int dinero, saldo = 1000 , operacion;
        String msj = new String(
                "Bienvenido al cajero ingrese el numero de la opcion que desea realizar\n"
                + "1. ingresar dinero\n"
                + "2.retirar\n"
                + "3. salir"
        );

        operacion = Integer.parseInt(JOptionPane.showInputDialog(msj));
        if(operacion == 1){
            dinero = Integer.parseInt(JOptionPane.showInputDialog("ingrese el monto a consignar"));
            saldo += dinero;
            JOptionPane.showMessageDialog(null,"su nuevo saldo es " + saldo);
        } else if(operacion == 2){
            dinero = Integer.parseInt(JOptionPane.showInputDialog("ingrese el monto a retiar"));
            if(dinero > 1000){
                JOptionPane.showMessageDialog(null,"fondos insuficientes");
            } else {
                saldo -= dinero;
                JOptionPane.showInputDialog("su nuevo saldo es " + saldo);
            }
        } else {
            JOptionPane.showMessageDialog(null,"fue un gusto servirle, hasta pronto!");
        }
    }
}
