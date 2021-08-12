import javax.swing.*;

public class ejercicio12 {
    /*
        Pedir 10 numeros, mostrar la media de los numeros positivos,
        la media de los numeros negativos y cantidad de ceros
    */
    public static void main(String[] args) {

        int num, sumaPositivos = 0, contadorPositivos = 0, sumaNegativos = 0, contadorNegativos = 0, contadorCeros = 0;
        float mediaPositiva, mediaNegativa;

        for (int i = 1; i <= 10; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("ingrese 10 numeros"));

            if (num == 0) {
                contadorCeros++;
            } else if (num > 0) {
                sumaPositivos += num;
                contadorPositivos++;
            } else {
                sumaNegativos += num;
                contadorNegativos++;
            }
        }
        if (sumaPositivos == 0) {
            System.out.println("Lo sentimos no podemos calcular la media de numeros positivos");
        } else {
            mediaPositiva = (float) sumaPositivos / contadorPositivos;
            System.out.println("la media de los numeros positivos ingresados es " + mediaPositiva);
        }
        if (sumaNegativos == 0) {
            System.out.println("Lo sentimos no podemos calcular la media de numeros negativos");
        } else {
            mediaNegativa = (float) sumaNegativos /contadorNegativos;
            System.out.println("la media de los numeros negativos es "+mediaNegativa);
        }
        System.out.println("la cantidad de 0 ingresados es "+contadorCeros);
    }
}
