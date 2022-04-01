import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {
    private JLabel label1;
    private JLabel label2;
    private JButton boton1;

    public Formulario() {
        setLayout(null); // para indicar que vamos a colocar coordenadas

        // Diseño de labels
        label1 = new JLabel("Interfaz grafica");
        label1.setBounds(10,20,300,30);
        add(label1);

        label2 = new JLabel("Version1.0");
        label2.setBounds(10,100,100,30);
        add(label2);


        // Diseño de boton
        boton1 = new JButton("cerrar");
        boton1.setBounds(270,250,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }


    public static void main(String[] args) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(500, 50, 400, 400);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null); // metodo para centrar la ventana
        formulario1.setResizable(false); //metodo para evitar modificaciones en la ventana
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton1){
            System.exit(0);
        }
    }
}
