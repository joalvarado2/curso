package ClasesYObjetos;

public class Coche {
    // atributos
    String color;
    String marca;
    int km;

    // Metodo
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();

        coche1.color = "Rojo";
        coche1.marca = "Mazda";
        coche1.km = 0;

        coche2.color = "Azul";
        coche2.marca = "Renault";
        coche2.km = 250;

        System.out.println("el color del vehiculo es "+coche1.color);
        System.out.println("la marca del vehiculo es "+coche1.marca);
        System.out.println("el kilometraje del vehiculo es "+coche1.km+"Km");

        System.out.println("");

        System.out.println("el color del vehiculo es "+coche2.color);
        System.out.println("la marca del vehiculo es "+coche2.marca);
        System.out.println("el kilometraje del vehiculo es "+coche2.km+"Km");


    }
}
