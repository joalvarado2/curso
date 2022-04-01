import javax.swing.*;
import javax.swing.event.*;

public class CheckBox extends JFrame implements ChangeListener {

    private JCheckBox check1, check2, check3;

    public CheckBox(){
        setLayout(null);
        check1 = new JCheckBox("English");
        check1.setBounds(10,10,150,30);
        check1.addChangeListener(this);
        add(check1);

        check2 = new JCheckBox("France");
        check2.setBounds(10,50,150,30);
        check2.addChangeListener(this);
        add(check2);

        check3 = new JCheckBox("Germany");
        check3.setBounds(10,90,150,30);
        check3.addChangeListener(this);
        add(check3);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        String cad = "";
        if(check1.isSelected() == true){
            cad = cad + "English-";
        }
        if(check2.isSelected() == true){
            cad = cad + "France-";
        }
        if(check3.isSelected() == true){
            cad = cad + "Germany-";
        }
        setTitle(cad);
    }

    public static void main(String[] args) {
        CheckBox formulario1 = new CheckBox();
        formulario1.setVisible(true);
        formulario1.setBounds(0, 0, 350, 200);
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(false);
    }

}
