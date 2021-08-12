import java.util.Scanner;

public class ejercicio4 {
      /*una compañia de venta de carros usados, paga a su personal de ventas un salario de  $1000 mensuales,
        mas una comision de $150 por cada carro vendido, mas el 5% del valor de la venta del carro.
        cada mes el capturista  de la empresa ingresa en la computadora los datos pertinentes.
        hacer un programa que calcule e imprima el salario mensual de un vendedor dado.*/

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double venta, comision, total;
        System.out.println("ingrese el valor del carro vendido");

        venta = entrada.nextDouble();
        comision = (venta * 5) / 100;
        total = comision + 150000;

        System.out.println("su ganancia de la venta hecha es de: $" + Math.round(total));
    }
}
