import javax.swing.*;

public class ejercicio14 {
    /*
        Dadas las edades y las alturas de 5 alumnos, mostrar la
        edad y la estatura media, la cantidad de alumnos mayores de 18
        años, y la cantidad de alumnos que miden mas de 1.75.
    */
    public static void main(String[] args) {
        int alumnoEdad, mayores18 = 0, mayorEstatura = 0;
        float alumnoEstatura, mediaEdad = 0, mediaEstatura = 0;

        for (int i = 1; i <= 5; i++) {
            alumnoEdad = Integer.parseInt(JOptionPane.showInputDialog("Alumno "+i+"\ningrese la edad"));
            alumnoEstatura = Float.parseFloat(JOptionPane.showInputDialog("Alumno "+i+"\ningrese la estatura"));

            mediaEdad += alumnoEdad;
            mediaEstatura += alumnoEstatura;

            if (alumnoEdad > 18) {
                mayores18++;
            }
            if(alumnoEstatura > 1.75){
                mayorEstatura++;
            }
        }
        System.out.println("El promedio de la edades es: "+mediaEdad/5);
        System.out.println("El promedio de las estaturas es: "+mediaEstatura/5);
        System.out.println("La cantidad de alumnos mayores a 18 es: "+mayores18);
        System.out.println("La cantidad de alumnos que miden mas de 1.75 son: "+mayorEstatura);
    }
}
