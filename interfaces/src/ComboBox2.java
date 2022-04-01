import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox2 extends JFrame implements ActionListener {

    private  JMenuBar menuBar;
    private  JMenu menu1;
    private JMenuItem menuItem1, menuItem2, menuItem3;

    public ComboBox2(){
        setLayout(null);
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        menu1 = new JMenu("Opciones");
        menuBar.add(menu1);

        menuItem1 = new JMenuItem("rojo");
        menuItem1.addActionListener(this);
        menu1.add(menuItem1);

        menuItem2 = new JMenuItem("verde");
        menuItem2.addActionListener(this);
        menu1.add(menuItem2);

        menuItem3 = new JMenuItem("azul");
        menuItem3.addActionListener(this);
        menu1.add(menuItem3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Container fondo = this.getContentPane();

        if(e.getSource() == menuItem1){
            fondo.setBackground(new Color(255,0,0));
        }
        if(e.getSource() == menuItem2){
            fondo.setBackground(new Color(0,255,0));
        }
        if(e.getSource() == menuItem3){
            fondo.setBackground(new Color(0,0,255));
        }
    }

    public static void main(String[] args) {
        ComboBox2 formulario1 = new ComboBox2();
        formulario1.setVisible(true);
        formulario1.setBounds(0, 0, 400, 400);
        formulario1.setLocationRelativeTo(null);
    }
}
