import javax.swing.*;

public class ejercicio11 {
    /*
        pedir un numero y calcular su factorial
    */
    public static void main(String[] args) {
        int num;
        long sum = 1;
        num = Integer.parseInt(JOptionPane.showInputDialog("digite un numero para sacar su factorial"));
        for(int i = 1; i<=num; i++){
            sum = sum * i;
        }
        System.out.println(sum);
    }
}

