import java.util.Scanner;

public class Vacacionales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int clave, antiguedad;

        System.out.println("Bienvenido al sistema vacacional\n" +
                "de Coca-Cola Company");


        System.out.println("Cual es el nombre del trabajador");
        nombre = entrada.nextLine();

        System.out.println("Cuantos años de servicio tiene el trabajador");
        antiguedad = entrada.nextInt();

        System.out.println("¿Cuál es la clave de su departamento?");
        clave = entrada.nextInt();

        if (clave == 1 || clave == 2 || clave == 3) {
            if (clave == 1) {
                if (antiguedad == 1) {
                    System.out.println(nombre + " tiene derecho a 6 dias");
                } else if (antiguedad >= 2 && antiguedad <= 6) {
                    System.out.println(nombre + " tiene derecho a 14 dias");
                } else if (antiguedad == 7) {
                    System.out.println(nombre + " tiene derecho a 14 dias");
                } else {
                    System.out.println("Aun no tiene derecho a vacaciones");
                }
            } else if (clave == 2) {
                if (antiguedad == 1) {
                    System.out.println(nombre + " tiene derecho a 7 dias");
                } else if (antiguedad >= 2 && antiguedad <= 6) {
                    System.out.println(nombre + " tiene derecho a 15 dias");
                } else if (antiguedad == 7) {
                    System.out.println(nombre + " tiene derecho a 22 dias");
                } else {
                    System.out.println("Aun no tiene derecho a vacaciones");
                }
            } else if (clave == 3) {
                if (antiguedad == 1) {
                    System.out.println(nombre + " tiene derecho a 10 dias");
                } else if (antiguedad >= 2 && antiguedad <= 6) {
                    System.out.println(nombre + " tiene derecho a 20 dias");
                } else if (antiguedad == 7) {
                    System.out.println(nombre + " tiene derecho a 30 dias");
                } else {
                    System.out.println("Aun no tiene derecho a vacaciones");
                }
            }

        } else {
            System.out.println("Error, la clave de departamento no existe.");
        }


    }
}
