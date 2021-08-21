import java.util.Scanner;

/*
    Leer 5 elementos numericos que se introduciran ordenados
    de forma creciente. estos los guardaremos en una tabla de tamaño 10.
    Leer un numero N, e insertarlo en el lugar adecuado para que la tabla
    continue ordenada.
*/
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabla[] = new int[10];
        int n, num = 0, j = 0;
        boolean creciente = true;
        do {
            for (var i = 0; i < 5; i++) {
                System.out.print("Digite el numero " + (i + 1) + " ");
                tabla[i] = entrada.nextInt();
            }

            // comprobando si el arreglo esta en orden creciente
            for (var i = 0; i < 4; i++) {
                if (tabla[i] < tabla[i + 1]) {
                    creciente = true;
                }
                if (tabla[i] > tabla[i + 1]) {
                    creciente = false;
                    break;
                }
            }

            if (creciente = false) {
                System.out.println("\nEl arreglo no esta ordenado en forma creciente");
            }

        } while (creciente = false);


        System.out.print("\nIngrese un numero para colocarlo en la tabla ");
        n = entrada.nextInt();

        // para saber en que posicion va el numero
        while (tabla[j] < n && j < 5) {
            num++;
            j++;
        }

        // trasladamos una posicion en el arreglo los elemntos que van detras del numero ingresado
        for (var i = 4; i >= num; i--) {
            tabla[i + 1] = tabla[i];
        }

        // insertamos el numero que el usuario puso
        tabla[num] = n;


        for (int element : tabla) {
            System.out.print(element + " ");
        }
    }
}

