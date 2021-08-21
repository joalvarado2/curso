import java.util.Scanner;

public class ejercicio8 {
    /*
        Diseñar una aplicacion que declare una tabla
        de 10 elementos enteros.
        Leer mediante el teclado 8 numeros. despues se
        debe pedir un numero y una posicion, insertarlo en
        la posicion indicada desplazando los que esten atras.
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabla[] = new int[10];
        int num, posicion;

        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + " Digite un numero ");
            tabla[i] = entrada.nextInt();
        }
        System.out.println("Tu tabla es la siguiente");
        for (int elem : tabla) {
            System.out.print(elem + " ");
        }

        // Vamos a pedir un numero y una posicion
        System.out.print("\nDigite un numero ");
        num = entrada.nextInt();
        do {
            System.out.print("Digite la posicion en donde desea guardar su numero no menor a 1 y no mayor a 9 ");
            posicion = entrada.nextInt();
        } while (posicion < 0 || posicion >= 10);

        // corriendo las posiciones de nuestro arreglo
        for (int i = 7; i >= posicion; i--) {
            tabla[i + 1] = tabla[i];
        }
        tabla[posicion] = num; // insertamos el numero

        for (int element : tabla) {
            System.out.print(element + " ");
        }
    }
}
