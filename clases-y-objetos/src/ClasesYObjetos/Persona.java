package ClasesYObjetos;

public class Persona {
    String nombre;
    int edad;

    //Metodo constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("El nombre es " + nombre);
        System.out.println("La edad es " + edad);
    }

    public static void main(String[] args) {
        Persona empleado = new Persona("Alejandra", 28);

        empleado.mostrarDatos();
    }
}
