import java.util.Scanner;

public class ejercicio2 {
    /*
        Leer 5 numeros, guardarlos en un arreglo
        y mostrarlos en orden inverso al introducido
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];

        System.out.println("Solicitando datos para el arreglo");

        for(int i = 0; i < 5; i++){
            System.out.print((i+1)+" Digite un numero ");
            numeros[i] = entrada.nextFloat();
        }
        System.out.println("Imprimiendo datos en orden inverso");
       for(int i = 4; i >= 0; i--){
           System.out.println(numeros[i]);
       }
    }
}
