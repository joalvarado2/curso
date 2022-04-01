import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextArea extends JFrame implements ActionListener {
    private JTextField textField1;
    private JTextArea texArea1;
    private JScrollPane scrool;
    private JButton boton1;

    String texto = "";


    public TextArea(){
        setLayout(null);
        textField1 = new JTextField();
        textField1.setBounds(10,10,200,30);
        add(textField1);

        texArea1 = new JTextArea();
       // texArea1.setBounds(10,50,400,300);  campos por si no se quiere scroll
       // add(texArea1);

        scrool = new JScrollPane(texArea1);
        scrool.setBounds(10,50,400,300);
        add(scrool);

        boton1 = new JButton("agregar");
        boton1.setBounds(250, 10, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
    }

    public static void main(String[] args) {
        TextArea formulario1 = new TextArea();
        formulario1.setVisible(true);
        formulario1.setBounds(0,0,540,400);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton1){
            texto += textField1.getText() + "\n";
            texArea1.setText(texto);
            textField1.setText("");
        }
    }
}
