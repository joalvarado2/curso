import javax.swing.*;

public class ejercicio7 {
    /*
        Pedir un numero N y mostrar los numeros de 1 al numero N
    */
    public static void main(String[] args) {
        int num, contador = 1;
        num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));

//        for(var i = 0; i <= num; i++){
//            System.out.println(i);
//        }
        while(contador <= num){
            System.out.println(contador);
            contador++;
        }
    }
}
