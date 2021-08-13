import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3 {
    /*
        Leer 5 numeros por teclado, almacernarlos en un arreglo
        y a continuacion realizar la media de los numeros positivos,
        la media de los numeros negativos y contar el numero de ceros
    */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        float sumaPositivos = 0, sumaNegativos = 0, mediaPositivos, mediaNegativos;
        int conteoPositivos = 0, conteoNegativos = 0, conteoCeros = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite el numero " +(i + 1)+ " de 5 ");
            numeros[i] = entrada.nextFloat();

            if (numeros[i] == 0) {
                conteoCeros++;
            } else if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                conteoPositivos++;
            } else {
                sumaNegativos += numeros[i];
                conteoNegativos++;
            }

        }
        if (conteoPositivos == 0) {
            System.out.println("no se puede sacar la media ya que el arreglo no contiene numeros positivos");
        } else {
            mediaPositivos = sumaPositivos / conteoPositivos;
            System.out.println("el promedio de los numeros positivos fue: "+mediaPositivos);
        }
        if(conteoNegativos == 0){
            System.out.println("no se puede sacar la media ya que el arreglo no contiene numeros negativos");
        } else {
            mediaNegativos = sumaNegativos / conteoNegativos;
            System.out.println("el promedio de los numeros negativos fue: "+mediaNegativos);
        }

        System.out.println("el conteo de ceros fue de "+conteoCeros);
        System.out.println(Arrays.toString(numeros));


    }
}

