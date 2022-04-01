import javax.swing.*;

public class ejercicio20 {
    /*
        Pedir 5 calificaciones de alumnos y decir al final
        si hay algun reprobado
    */
    public static void main(String[] args) {
        float notas;
        int reprobado = 0;
        for (int i = 1; i <= 5; i++) {
            do {
                notas = Float.parseFloat(JOptionPane.showInputDialog("ingrese la nota del alumno # " + i));
            } while (notas < 0 || notas > 10);

            if (notas < 5) {
                reprobado++;
            }
        }
        if (reprobado > 0) {
            System.out.println("el numero de reprobados fue : " + reprobado);
        } else {
            System.out.println("no hay alumnos reprobados");
        }
    }
}
