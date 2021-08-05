import java.util.Scanner;


public class HolaMundo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double cal1f, cal2f, cal3f, sumaf;

        System.out.println("ingrese la tres notas a sumar");
        cal1f = entrada.nextDouble();
        cal2f = entrada.nextDouble();
        cal3f = entrada.nextDouble();

        sumaf = cal1f + cal2f + cal3f;

        System.out.println("la suma de las calificaciones es " + sumaf);

    }
}

