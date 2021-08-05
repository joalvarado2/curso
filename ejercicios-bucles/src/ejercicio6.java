import javax.swing.*;

public class ejercicio6 {
    /*
        pedir numeros hasta que se introduzca un numero negativo,
        y calcular la media
    */
    public static void main(String[] args) {
        float num, contador = 0, suma = 0, media;

        num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));

        while(num > 0){
            suma = suma + num;
            contador++;
            num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        }
        if(num == 0){
            System.out.println("has ingresado un numero negativo, no sirve para calcular la media");
        } else {
            media = suma / contador;
            System.out.println("la media aritmetica de los elemento es "+ media);
        }
    }
}
