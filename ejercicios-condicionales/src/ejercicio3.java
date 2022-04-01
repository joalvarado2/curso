import java.util.Scanner;

public class ejercicio3 {
    //    guillermo tiene N dolares. Luis tiene mitad de lo que posee Guillermo.
//    Juan tiene la mitad de lo que poseen Luis y guillermo juntos. hacer un programa
//    que calcule e imprima la cantidad de dinero que tienen los tres.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float guillermo, juan, luis, total;
        System.out.println("digite la cantida de dolares que tiene guillermo");

        guillermo = entrada.nextFloat();
        luis = guillermo / 2; // es la mitad de lo que tiene guillermo
        juan = (guillermo + luis) / 2;
        total = guillermo + luis + juan;

        System.out.println("la cantidad de dinero que tienen los tres es: " + Math.round(total));

    }
}
