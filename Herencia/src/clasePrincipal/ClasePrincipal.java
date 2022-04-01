package clasePrincipal;

import operaciones.ClaseHija_Suma;
import operaciones.ClaseHija_Resta;


public class ClasePrincipal {
    public static void main(String[] args) {
        ClaseHija_Suma mensajero = new ClaseHija_Suma();
        mensajero.PedirDatos();
        mensajero.Sumar();
        System.out.print("El resultado de la suma: ");
        mensajero.MostrarResultado();

        ClaseHija_Resta mensajeroResta = new ClaseHija_Resta();
        mensajeroResta.PedirDatos();
        mensajeroResta.Restar();
        System.out.print("El resultado de la resta es:");
        mensajeroResta.MostrarResultado();
    }
}
