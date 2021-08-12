import javax.swing.*;

public class ejercicio10 {
    /*
        Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
      * si trabaja 40 horas o menos se le paga $16 por hora.
      * si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y 20$ por
        cada hora extra.
    */
    public static void main(String[] args) {
        float salarioSemanal;
        int horasTrabajo, extras;

        horasTrabajo =Integer.parseInt(JOptionPane.showInputDialog("escriba el numero de horas trabajadas en la semana"));

        if(horasTrabajo <= 40) {
            salarioSemanal = horasTrabajo * 16;
            JOptionPane.showMessageDialog(null,"el salario semanal equivale a " + salarioSemanal);
        } else {
            salarioSemanal = (40 * 16) + ((horasTrabajo - 40) * 20);
            JOptionPane.showMessageDialog(null,"su salario semanal equivale a " + salarioSemanal);
        }
    }
}
