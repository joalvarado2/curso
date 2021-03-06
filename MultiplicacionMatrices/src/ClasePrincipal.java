public class ClasePrincipal {
    public static void main(String[] args) {

        int matriz_uno[][] = new int[2][3];
        int matriz_dos[][] = new int[3][2];
        int matriz_resultado[][] = new int[2][2];

        // llenado de matriz uno
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz_uno[i][j] = (int) (Math.random() * 5);
            }
        }

        // llenado de matriz dos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matriz_dos[i][j] = (int) (Math.random() * 5);
            }
        }

        // Multiplicacion de matrices
        for (int i = 0; i < 4; i++) {
            if (matriz_resultado[0][0] == 0) {
                int temporal = (matriz_uno[0][0] * matriz_dos[0][0])
                        + (matriz_uno[0][1] * matriz_dos[1][0])
                        + (matriz_uno[0][2] * matriz_dos[2][0]);

                matriz_resultado[0][0] = temporal;
            }

            if (matriz_resultado[1][0] == 0) {
                int temporal = (matriz_uno[1][0] * matriz_dos[0][0])
                        + (matriz_uno[1][1] * matriz_dos[1][0])
                        + (matriz_uno[1][2] * matriz_dos[2][0]);

                matriz_resultado[1][0] = temporal;
            }

            if (matriz_resultado[0][1] == 0) {
                int temporal = (matriz_uno[0][0] * matriz_dos[0][1])
                        + (matriz_uno[0][1] * matriz_dos[1][1])
                        + (matriz_uno[0][2] * matriz_dos[2][1]);

                matriz_resultado[0][1] = temporal;
            }

            if (matriz_resultado[1][1] == 0) {
                int temporal = (matriz_uno[1][0] * matriz_dos[0][1])
                        + (matriz_uno[1][0] * matriz_dos[1][1])
                        + (matriz_uno[1][2] * matriz_dos[2][1]);

                matriz_resultado[1][1] = temporal;
            }
        }

        //Imprimiendo matrices
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[ " + matriz_uno[i][j] + " ]");
                }
                if (i == 1) {
                    System.out.print("   x   ");
                } else {
                    System.out.print("       ");
                }
            } else {
                System.out.print("                      ");
            }

            for (int j = 0; j < 2; j++) {
                System.out.print("[ " + matriz_dos[i][j] + " ]");
            }
            if (i == 1) {
                System.out.print("   =   ");
            } else {
                System.out.print("       ");
            }

            if (i < 2) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("[ " + matriz_resultado[i][j] + " ]");
                }
            }
            System.out.println("");
        }
    }
}
