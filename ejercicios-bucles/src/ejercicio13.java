import javax.swing.*;

public class ejercicio13 {
    /*
        Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de $1000
    */
    public static void main(String[] args) {
        double  sueldo, totalSueldo = 0;
        int sueldoMayor = 0;

        for(var i = 1; i <= 10; i++){
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("ingrese 10 salarios"));
            totalSueldo = totalSueldo + sueldo;
            if(sueldo > 1000){
                sueldoMayor++;
            }
        }
        System.out.println("la suma de todos los valores ingresados: "+totalSueldo+"y ingresaste "+ sueldoMayor+" cantidades mayores a 1000");

    }
}
