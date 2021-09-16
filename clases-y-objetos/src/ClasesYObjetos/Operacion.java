package ClasesYObjetos;

import javax.swing.*;
import java.util.jar.JarEntry;

public class Operacion {

    //Metodo para sumar
    public int sumar(int a, int b) {
        int suma = a + b;
        return suma;
    }

    //Metodo para restar
    public int restar(int a, int b) {
        int resta = a - b;
        return resta;
    }

    //metodo para mulltiplicar
    public int multiplicar(int a, int b) {
        int multiplicacion = a * b;
        return multiplicacion;
    }

    //Metodo para dividir
    public int dividir(int a, int b) {
        int division = a / b;
        return division;
    }

    //Metodo para mostrar resultados
    public void mostrarResultado(int suma, int resta, int multiplicacion, int division) {
        System.out.println("la suma es: " + suma);
        System.out.println("la resta es: " + resta);
        System.out.println("la multiplicacion es: " + multiplicacion);
        System.out.println("la division es: " + division);
    }

    public static void main(String[] args) {

        Operacion ecuaciones = new Operacion();

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        int suma = ecuaciones.sumar(n1, n2);
        int resta = ecuaciones.restar(n1, n2);
        int multiplicacion = ecuaciones.multiplicar(n1, n2);
        int division = ecuaciones.dividir(n1, n2);

        ecuaciones.mostrarResultado(suma, resta, multiplicacion, division);
    }
}
