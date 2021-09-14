import java.util.Scanner;

/*  Leer por teclado una tabla de 10 elementos numericos enteros y una posicion
    entre 0 y 9. eliminar el elemento situado en la posicion dada sin dejar huecos
*/
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int posicion;

        for(var i = 0; i < 10; i++){
            System.out.print(i+" digite un numero ");
            arreglo[i] = entrada.nextInt();
        }

        do{
            System.out.print("digite una posicion (0-9) ");
            posicion = entrada.nextInt();
        } while(posicion < 0 || posicion > 9);

        //eliminando el elemento en la posicion dada

        for(int i = posicion; i < 9;i++){
            arreglo[i] = arreglo[i+1];
        }

       /* for (int element:arreglo) {
            System.out.println("el arreglo que queda fue: "+element);
        }*/
        System.out.println("/n el arreglo queda: ");
        for(int i = 0; i < 9; i++){
            System.out.println(i+" elemento: "+arreglo[i]);
        }
    }
}
