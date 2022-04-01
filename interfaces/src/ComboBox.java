import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBox extends JFrame implements ItemListener {
    private JComboBox combo1;

    public  ComboBox(){
        setLayout(null);
        combo1 = new JComboBox();
        combo1.setBounds(10,10,80,20);
        add(combo1);

        combo1.addItem("rojo");
        combo1.addItem("Azul");
        combo1.addItem("Verde");
        combo1.addItem("Amarillo");
        combo1.addItem("Cafe");
        combo1.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == combo1){
            String seleccion = combo1.getSelectedItem().toString();
            setTitle(seleccion);
        }
    }

    public static void main(String[] args) {
        ComboBox formulario1 = new ComboBox();
        formulario1.setVisible(true);
        formulario1.setBounds(0,0,300,150);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}
