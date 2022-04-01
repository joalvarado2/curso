public class Matriz {
    public static void main(String[] args) {
        // crear un programa que me muestre en pantalla una matriz de 2 filas y 2 columnas
        // con un numero dentro de cada posicion tal y como se muestras a continuacion
                // [5] [2]
                // [2] [5]

        int numeros[][] = new int [2][2];

        numeros [0][0] = 5;
        numeros [0][1] = 2;
        numeros [1][0] = 2;
        numeros [1][1] = 5;

        System.out.print("[" + numeros [0][0] + "]");
        System.out.println("[" + numeros [0][1] + "]");
        System.out.print("[" + numeros [1][0] + "]");
        System.out.print("[" + numeros [1][1] + "]");
        System.out.println("");

        //////////////////////////////////////////////////////////////////////////

        // crear un programa que genere una matriz de 3x3 mostrando los numeros del 1 al 9

        int numeros2[][] = new int[3][3];
        int filas = 3, columnas = 3, contador = 1;

        for(int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                numeros2[i][j] = contador;

                contador++;

                System.out.print("[" + numeros2[i][j] + "]");
            }
            System.out.println("");
        }


    }
}
