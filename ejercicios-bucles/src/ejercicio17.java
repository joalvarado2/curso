import javax.swing.*;

public class ejercicio17 {
    /*
        Dadas 6 notas, escribir la cantidad de alumnos aprobados,
        condicionados (=4) y reprobados.
    */
    public static void main(String[] args) {
        float nota;
        int aprobado = 0, condicionado = 0, reprobado = 0;

        for (int i = 1; i <= 6; i++) {
            do {
                nota = Float.parseFloat(JOptionPane.showInputDialog("ingrese la nota del alumno "+i+" de 1 a 10"));
            } while (nota < 0 || nota > 10);

            if (nota >= 5 ) {
                aprobado++;
            }
            if (nota == 4) {
                condicionado++;
            }
            if (nota < 4) {
                reprobado++;
            }
        }
        System.out.println("las notas fueron \n" +
                "reprobados " + reprobado + "\n" +
                "condicionados: " + condicionado + "\n" +
                "reprobados: " + reprobado);

    }
}
