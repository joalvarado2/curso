import java.util.Scanner;

public class ejercicio2 {
//    hacer un programa que calcule e imprima el salario semanal de un empleado a partir
//    de sus horas semanales trabajadas y de su salario por hora

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salarioPorHora = 3.541666666666667, horas, salarioSemanal;
        System.out.println("ingrese sus horas trabajadas en la semana");
        horas = entrada.nextDouble();
        salarioSemanal = salarioPorHora * horas;

        System.out.println("su salario semanal fue de: " + Math.round(salarioSemanal) + " mil pesos");


    }
}
