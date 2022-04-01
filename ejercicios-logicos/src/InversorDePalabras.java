import java.util.Scanner;

public class InversorDePalabras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        int num1 = 0, num2 = 0, resultado = 0;

        System.out.println("cual es tu nombre");
        nombre = entrada.nextLine();

        System.out.println("ingrese el primer numero");
        num1 = entrada.nextInt();

        System.out.println("ingrese el segundo numero");
        num2 = entrada.nextInt();

        resultado = num1 + num2;

        System.out.println("Hola " +nombre + " el resultado de tu suma fue " + resultado);

    }
}
