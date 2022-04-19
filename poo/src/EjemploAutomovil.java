public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil renault = new Automovil();
        renault.fabricante = "Renault";
        renault.color = "Blanco";
        renault.modelo = "Logan";
        renault.clilindraje = 1.200;


        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.color = "Negro";
        mazda.modelo = "CX-30";
        mazda.clilindraje = 1.600;

        System.out.println(mazda.detalle());
        System.out.println("");
        System.out.println(mazda.acelerar(2000));
        System.out.println(mazda.frenar());

        System.out.println("");

        System.out.println(renault.acelerarFrenar(4000));

       System.out.println("Kilometros por litro " + mazda.calcularConsumo(300, 0.6f));
       System.out.println("Kilometros por litro " + renault.calcularConsumo(300, 60));

    }
}
