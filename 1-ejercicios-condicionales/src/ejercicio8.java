import javax.swing.*;

// pida una letra por ventana y compruebe si es mayuscula o minuscula y arroje el resultado segun corresponda.

public class ejercicio8 {

    public static void main(String[] args) {
        String letter;

        letter = JOptionPane.showInputDialog("digite una letra");

        if(letter == letter.toUpperCase()){
            JOptionPane.showMessageDialog(null,"la letra " + letter + " es mayuscula");
        }
        else {
            JOptionPane.showMessageDialog(null,"la letra "+ letter + " es minuscula");
        }
    }
}
