public class Hija extends Padre {
    public void Saludar() {
        System.out.println("Hola, yo soy la hija.");
        super.Saludar(); // sirve para usar el metodo de la clase extendida padre
    }
}
