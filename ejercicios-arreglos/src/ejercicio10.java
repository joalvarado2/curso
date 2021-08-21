import java.util.Scanner;

/*
    Crear un programa que lea por teclado una tabla de 10 numeros enteros
    y los desplace N posiciones en el arreglo (N es digitado por el usuiario)
*/
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arr[] = new int[10];
        int posicion, ultimo;

        for (var i = 0; i < 10; i++){
            System.out.print("digite el numero "+(i+1)+" ");
            arr[i] = entrada.nextInt();
        }
        do {
            System.out.print("digite el numero de posiciones ");
            posicion = entrada.nextInt();
        } while (posicion < 1 || posicion > 9);

        for(var vuelta = 1; vuelta <= posicion; vuelta++ ){
            ultimo = arr[9];
            for(var j = 8; j >= 0; j--){
                arr[j+1] = arr[j];
            }
            arr[0] = ultimo;
        }

        for (int element:arr) {
            System.out.print(element+" ");
        }

    }
}
