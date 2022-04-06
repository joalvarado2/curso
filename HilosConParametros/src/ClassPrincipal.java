public class ClassPrincipal {
    public static void main(String[] args) {
        Proceso hilo1 = new Proceso(" hilo1");
        Proceso hilo2 = new Proceso(" hilo2");
        Proceso hilo3 = new Proceso(" hilo3");

        hilo1.ValorDeLaCondicion(10);
        hilo2.ValorDeLaCondicion(15);
        hilo2.ValorDeLaCondicion(20);

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
