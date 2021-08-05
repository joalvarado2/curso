import javax.swing.*;

public class ejercicio9 {
    /*
     en mega plaza se hace un descuento de  20% de descuento a los clientes cuya compra supere los 300.
     cual sera la cantidad que pagara una persona por su compra?
    */
    public static void main(String[] args) {
        float precioCompra, descuento;

        precioCompra = Float.parseFloat(JOptionPane.showInputDialog("digite el precio total de la compra"));

        if (precioCompra > 300) {
            descuento = (float) (precioCompra * 20 / 100);
            precioCompra = precioCompra - descuento;
            JOptionPane.showMessageDialog(null, "el precio de la compra con descuento es " + precioCompra);
        } else {
            JOptionPane.showMessageDialog(null, "la compra no aplica para descuento por lo tanto es " + precioCompra);
        }
    }
}
