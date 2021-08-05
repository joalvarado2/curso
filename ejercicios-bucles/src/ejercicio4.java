import javax.swing.*;

public class ejercicio4 {
    /*
        Realizar un juego para adivinar el numero. para ello generar
        un numero aleatorio entre 0 - 100, y luego ir pidiendo numeros
        indicando es mayor o es menor segun sea mayor o menor con respecto a N.
        el proceso termina cuando el usuario acierta y mostrar el numero de intentos.
    */
    public static void main(String[] args) {
        int num, aleatorio, contador = 0;

        aleatorio = (int) (Math.random() * 100);

        num = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));

        while (num != aleatorio) {
            if (num > aleatorio) {
                System.out.println("el numero " + num + " es mayor al del numero aleatorio");
                num = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
            } else {
                System.out.println("el numero " + num + " es menor al del numero aleatorio");
                num = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
            }
            contador++;
        }

        System.out.println("acertaste! tu numero de intentos fue " + contador);
    }
}
