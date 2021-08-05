/*construir un programa que, dado un numero total de horas, devuelve el numero de semanas,
dias y horas equivalentes. por ejemplo, dado un total de mil horas debe mostrar 5 semanas, 6 dias y
16 horas.*/

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horasTotales, semanas, dias, horas;

        System.out.println("digite el numero de horas");
        horasTotales = entrada.nextInt();

        semanas = horasTotales / 168;
        dias = horasTotales % 168 / 24;
        horas = horasTotales % 24;

        System.out.println("\nEl equivalente es: ");
        System.out.println("semanas: " + semanas);
        System.out.println("dias: " + dias);
        System.out.println("horas: " + horas);
    }
}
