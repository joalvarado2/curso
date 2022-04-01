import javax.swing.*;

public class ejercicio16 {
    /*
        Una empresa que se dedica a la venta de desinfectantes
        necesita un programa para gestionar las facturas.
        en cada factura figura: el codigo del articulo, cantidad vendida en litros
        y el precio por litro. Se pide de 5 facturas introducidas:
        Facturacion total, cantidad de litros vendidios del articulo1
        y cuantas facturas se emitieron de mas de $600.
    */
    public static void main(String[] args) {
        int codigo, cantidad = 0, factMayor = 0, totalLts1=0;
        float precioLts, factTotal = 0,  totalFacturacion = 0;

        for(int i = 1; i<=5; i++){
            codigo = Integer.parseInt(JOptionPane.showInputDialog("factura "+i+"\n ingrese el codigo"));
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("factura "+i+"\n ingrese la cantidad de litros"));
            precioLts = Float.parseFloat(JOptionPane.showInputDialog("factura "+i+"\n ingrese el precio por litro"));

            totalFacturacion += cantidad * precioLts;

            if(codigo == 1){
                totalLts1 += cantidad;
            }
            if(totalFacturacion > 600){
                factMayor++;
            }
            cantidad+= cantidad;
            factTotal += factMayor;
        }
        System.out.println("la facturacion total de las facturas es: "+totalFacturacion);
        System.out.println("la cantidad de litros vendidas del articulo 1 fue: "+cantidad);
        System.out.println("la cantidad de facturas que se emitieron de mas de $600 fue "+factMayor);
    }
}
