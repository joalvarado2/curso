package polimorfismo;

public class ClasePrincipal {
    public static void main(String[] args) {
        Operaciones_ClasePadre mensajero_Suma = new Suma_Clase_Hija();
        mensajero_Suma.PedirDatos();
        mensajero_Suma.Operaciones();
        mensajero_Suma.MostrarResultado();

        Operaciones_ClasePadre mensajeroResta = new Resta_Clase_Hija();
        mensajeroResta.PedirDatos();
        mensajeroResta.Operaciones();
        mensajeroResta.MostrarResultado();
    }
}
