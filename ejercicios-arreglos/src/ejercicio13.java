import java.util.Scanner;

/*  leer 10 enteros en una tabla. guardar en otra tabla
    los elementos pares y en otra tabla los elementos impares
*/
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabla[] = new int[10];
        int cont_pares = 0, cont_impares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " ingrese 10 numeros ");
            tabla[i] = entrada.nextInt();

            if (tabla[i] % 2 == 0) {
                cont_pares++;
            } else {
                cont_impares++;
            }
        }
        // crear los arreglos siguientes
        int par[] = new int[cont_pares];
        int impar[] = new int[cont_impares];

        cont_pares = 0;
        cont_impares = 0;

        for(int i = 0; i < 10; i++){
            if(tabla[i] % 2 == 0){
                par[cont_pares] = tabla[i];
                cont_pares++;
            } else {
                impar[cont_impares] = tabla[i];
                cont_impares++;
            }
        }
        System.out.print("\narreglo pares: ");
        for(int i = 0; i <cont_pares; i++){
            System.out.print(par[i] + " - ");
        }
        System.out.println("");

        System.out.print("\narreglo impares: ");
        for(int i = 0; i <cont_impares; i++){
            System.out.print(impar[i] + " - ");
        }
        System.out.println("");
    }
}

