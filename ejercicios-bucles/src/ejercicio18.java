import javax.swing.*;

public class ejercicio18 {
    /*
        Pedir un numero N de catidad de suldos a ingresar,
        introducir N sueldos, y mostrar el sueldo maximo
    */
    public static void main(String[] args) {

        int num = 0;
        float sueldo, sueldoMayor = 0;
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de sueldos que desea ingresar minimo 1 y maximo 5 "));
        } while(num < 1 || num > 5);

        for(int i = 1; i <= num; i++){
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("ingrese el sueldo #"+i));
            if(sueldo > sueldoMayor){
                sueldoMayor = sueldo;
            }

        }
        System.out.println("el sueldo mayor ha sido: "+sueldoMayor);
    }
}
