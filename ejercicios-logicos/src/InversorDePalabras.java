import java.util.Scanner;

public class InversorDePalabras {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String palabra = "", palabraInvertida = "";
        int longitudPalabra = 0;

        System.out.println("Escribe una palabra");
        palabra = entrada.nextLine();
        longitudPalabra = palabra.length();

        for (int i = longitudPalabra - 1 ; i >= 0; i--) {
            palabraInvertida += palabra.charAt(i);
        }
        System.out.println(palabra.substring(0,4));
        System.out.println("tu palabra " + palabra + " invertida es : " + palabraInvertida);
    }
}
