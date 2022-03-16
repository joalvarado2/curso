import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener {
    private JLabel label1, label2;
    private JCheckBox check1;
    private JButton boton1, boton2;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;

    public Licencia() {
        setLayout(null);
        setTitle("licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        label1 = new JLabel(("TERMINOS Y CONDICIONES"));
        label1.setBounds(215, 5, 200, 30);
        label1.setFont(new Font("Andale Mono", 1, 14));
        label1.setForeground(new Color(0, 0, 0));
        add(label1);

        textArea1 = new JTextArea();
        textArea1.setEditable(false);
        textArea1.setFont(new Font("Andale Mono", 0, 9));
        textArea1.setText(("\n\n          Terminos y condiciones" +
                "\n\n           A. Prohibida............." +
                "\n\n           B. Prohibida............." +
                "\n\n           C. Prohibida............." +
                "\n             There are many variations of passages of Lorem Ipsum available, but the majority have " +
                "\n             suffered alteration in some form, by injected humour, or randomised words which don't ,"+
                "\n             look even slightly believable. If you are going to use a passage of Lorem Ipsum"+
                "\n\n           D. Prohibida............." +
                "\n\n           E. Prohibida............."

        ));
        scrollPane1 = new JScrollPane(textArea1);
        scrollPane1.setBounds(10, 40, 575, 200);
        add(scrollPane1);

        check1 = new JCheckBox("Yo Acepto");
        check1.setBounds(10, 250, 300, 30);
        check1.addChangeListener(this);
        add(check1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10, 290, 100, 30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);

        boton2 = new JButton("No Acepto");
        boton2.setBounds(120, 290, 100, 30);
        boton2.addActionListener(this);
        boton2.setEnabled(true);
        add(boton2);


        label2 = new JLabel();
        label2.setIcon(new ImageIcon("images/coca-cola.png"));
        label2.setBounds(315, 135, 900, 300);
        add(label2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }

    public static void main(String[] args) {
        Licencia ventanaLicencia = new Licencia();
        ventanaLicencia.setBounds(0, 0, 600, 360);
        ventanaLicencia.setVisible(true);
        ventanaLicencia.setResizable(false);
        ventanaLicencia.setLocationRelativeTo(null);
    }
}
