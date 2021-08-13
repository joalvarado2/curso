import java.util.Scanner;

public class ejercicio5 {
    /*
        Leer por teclado dos tablas de 10 numeros enteros y
        mezclarlas en una tercera de la forma:
        el primero del A, el primero del B, el segundo del A,
        el segundo del B, etc
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tablaA[] = new int[10];
        int tablaB[] = new int[10];
        int tablaC[] = new int[20];

        System.out.println("Digite los numeros de la tabla 1");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " Digite el numero "+(i+1)+" de la tabla A ");
            tablaA[i] = entrada.nextInt();
        }

        System.out.println("\n Digite los numeros del arreglo B");

        for(int i = 0; i < 10; i++){
            System.out.print((i + 1) + " Digite el numero "+(i+1)+" de la tabla B ");
            tablaB[i] = entrada.nextInt();
        }

        //Mezcla de los 23 arreglos en la tabla C
        int j = 0;
        for(int i = 0; i < 10; i++){
            tablaC[j] = tablaA[i];
            j++;
            tablaC[j] = tablaB[i];
            j++;
        }
        for (int element:tablaC) {
            System.out.print(element+" ");
        }
    }
}
