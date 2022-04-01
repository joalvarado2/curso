package lavadora_uno;

import llFunciones.LLFunciones;

import java.util.Scanner;


public class Lavadora_Uno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("La ropa es blanca o de color?");
        System.out.println("Presiona 1 - ropa blanca  /  2 - ropa color");
        int tipoRopa = entrada.nextInt();

        System.out.println("Cuantos kilos de ropa?");
        int kilos = entrada.nextInt();

        LLFunciones mensajero = new LLFunciones(kilos, tipoRopa);
        mensajero.setTipoRopa(2);
        System.out.println("El tipo de ropa es "+ mensajero.getTipoRopa());
        mensajero.CicloFinalizado();
    }
}
