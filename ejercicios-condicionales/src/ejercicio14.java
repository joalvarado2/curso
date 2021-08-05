import javax.swing.*;

public class ejercicio14 {
    /*
        Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta.
        suponiendo que todos los meses son de 30 dias.
    */
    public static void main(String[] args) {
        int day, month, year;

        day = Integer.parseInt(JOptionPane.showInputDialog("escriba el dia de una fecha"));
        month = Integer.parseInt(JOptionPane.showInputDialog("escriba el mes de una fecha"));
        year = Integer.parseInt(JOptionPane.showInputDialog("escriba el año de una fecha"));

        if((day >= 1 && day <= 30) && (month >= 1 && month <= 12) && (year > 1920 && year <= 2021)){
            JOptionPane.showMessageDialog(null,"la fecha ingresada es "+ day + "/" + month + "/" + year);
        } else {
            JOptionPane.showMessageDialog(null, "la fecha ingresada es incorrecta");
        }
    }
}
