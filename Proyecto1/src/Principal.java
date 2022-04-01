import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame implements ActionListener {

    private JMenuBar mb;
    private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
    private JMenuItem miCalculo, miRojo, miNegro, miMorado, MiElCreador, miSalir, miNuevo;
    private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelAPaterno, labelAMaterno,
            labelDepartamento, labelAntiguedad, labelResultado, labelFooter;
    private JTextField txtNombreTrabajador, txtAPaternoTrabajador, txtAMaternoTrabajador;
    private JComboBox comboDepartamento, comboAntiguedad;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    String nombreAdministrador = "";

    public Principal() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Pantalla Principal");
        getContentPane().setBackground(new Color(255, 0, 0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        Bienvenida ventanaBienvenida = new Bienvenida();
        nombreAdministrador = ventanaBienvenida.texto;

        mb = new JMenuBar();
        mb.setBackground(new Color(255, 0, 0));
        setJMenuBar(mb);

        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(255, 0, 0));
        menuOpciones.setFont(new Font("Andale Mono", 1, 14));
        menuOpciones.setForeground(new Color(255, 255, 255));
        mb.add(menuOpciones);

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(255, 0, 0));
        menuCalcular.setFont(new Font("Andale Mono", 1, 14));
        menuCalcular.setForeground(new Color(255, 255, 255));
        mb.add(menuCalcular);

        menuAcercaDe = new JMenu("Acerca de");
        menuAcercaDe.setBackground(new Color(255, 0, 0));
        menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
        menuAcercaDe.setForeground(new Color(255, 255, 255));
        mb.add(menuAcercaDe);

        menuColorFondo = new JMenu("Color de Fondo");
        menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
        menuColorFondo.setForeground(new Color(255, 0, 0));
        menuOpciones.add(menuColorFondo);

        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.setFont(new Font("Andale Mono", 1, 14));
        miCalculo.setForeground(new Color(255, 0, 0));
        menuCalcular.add(miCalculo);
        miCalculo.addActionListener(this);

        miRojo = new JMenuItem("Rojo");
        miRojo.setFont(new Font("Andale Mono", 1, 14));
        miRojo.setForeground(new Color(255, 0, 0));
        menuColorFondo.add(miRojo);
        miRojo.addActionListener(this);

        miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font("Andale Mono", 1, 14));
        miNegro.setForeground(new Color(255, 0, 0));
        menuColorFondo.add(miNegro);
        miNegro.addActionListener(this);

        miMorado = new JMenuItem("Morado");
        miMorado.setFont(new Font("Andale Mono", 1, 14));
        miMorado.setForeground(new Color(255, 0, 0));
        menuColorFondo.add(miMorado);
        miMorado.addActionListener(this);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono", 1, 14));
        miNuevo.setForeground(new Color(255, 0, 0));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);

        MiElCreador = new JMenuItem("El creador");
        MiElCreador.setFont(new Font("Andale Mono", 1, 14));
        MiElCreador.setForeground(new Color(255, 0, 0));
        menuAcercaDe.add(MiElCreador);
        MiElCreador.addActionListener(this);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono", 1, 14));
        miSalir.setForeground(new Color(255, 0, 0));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);

        ImageIcon imagen = new ImageIcon("images/logo-coca.png");
        labelLogo = new JLabel(imagen);
        labelLogo.setBounds(5, 5, 250, 100);
        add(labelLogo);

        labelBienvenido = new JLabel("Bienvenido " + nombreAdministrador);
        labelBienvenido.setBounds(20, 30, 600, 50);
        labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
        labelBienvenido.setForeground(new Color(255, 255, 255));
        add(labelBienvenido);

        labelTitle = new JLabel("Datos del trabajador para el calculo de vacaciones");
        labelTitle.setBounds(45, 140, 900, 25);
        labelTitle.setFont(new Font("Andale Mono", 0, 24));
        labelTitle.setForeground(new Color(255, 255, 255));
        add(labelTitle);

        labelNombre = new JLabel("Nombre Completo");
        labelNombre.setBounds(25, 188, 180, 25);
        labelNombre.setFont(new Font("Andale Mono", 1, 12));
        labelNombre.setForeground(new Color(255, 255, 255));
        add(labelNombre);

        txtNombreTrabajador = new JTextField();
        txtNombreTrabajador.setBounds(25, 213, 150, 25);
        txtNombreTrabajador.setBackground(new java.awt.Color(224, 224, 224));
        txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtNombreTrabajador.setForeground(new java.awt.Color(255, 0, 0));
        add(txtNombreTrabajador);

        labelAPaterno = new JLabel("Apellido Paterno");
        labelAPaterno.setBounds(25, 248, 180, 25);
        labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
        labelAPaterno.setForeground(new Color(255, 255, 255));
        add(labelAPaterno);

        txtAPaternoTrabajador = new JTextField();
        txtAPaternoTrabajador.setBounds(25, 273, 150, 25);
        txtAPaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
        txtAPaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtAPaternoTrabajador.setForeground(new java.awt.Color(255, 0, 0));
        add(txtAPaternoTrabajador);

        labelAMaterno = new JLabel("Apellido Materno");
        labelAMaterno.setBounds(25, 308, 180, 25);
        labelAMaterno.setFont(new Font("Andale Mono", 1, 12));
        labelAMaterno.setForeground(new Color(255, 255, 255));
        add(labelAMaterno);

        txtAMaternoTrabajador = new JTextField();
        txtAMaternoTrabajador.setBounds(25, 334, 150, 25);
        txtAMaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
        txtAMaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtAMaternoTrabajador.setForeground(new java.awt.Color(255, 0, 0));
        add(txtAMaternoTrabajador);

        labelDepartamento = new JLabel("Selecciona Departamento");
        labelDepartamento.setBounds(220, 188, 180, 25);
        labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
        labelDepartamento.setForeground(new Color(255, 255, 255));
        add(labelDepartamento);

        comboDepartamento = new JComboBox();
        comboDepartamento.setBounds(220, 213, 220, 25);
        comboDepartamento.setBackground(new java.awt.Color(224, 224, 224));
        comboDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
        comboDepartamento.setForeground(new java.awt.Color(255, 0, 0));
        add(comboDepartamento);
        comboDepartamento.addItem("");
        comboDepartamento.addItem("Atencion al Cliente");
        comboDepartamento.addItem("Departamento De Logistica");
        comboDepartamento.addItem("Departamento De Gerencia");

        labelAntiguedad = new JLabel("Selecciona Antiguedad");
        labelAntiguedad.setBounds(220, 248, 180, 25);
        labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
        labelAntiguedad.setForeground(new Color(255, 255, 255));
        add(labelAntiguedad);

        comboAntiguedad = new JComboBox();
        comboAntiguedad.setBounds(220, 273, 220, 25);
        comboAntiguedad.setBackground(new java.awt.Color(224, 224, 224));
        comboAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
        comboAntiguedad.setForeground(new java.awt.Color(255, 0, 0));
        add(comboAntiguedad);
        comboAntiguedad.addItem("");
        comboAntiguedad.addItem("1 Año de Servicio");
        comboAntiguedad.addItem("2 a 6 Años de Servicio");
        comboAntiguedad.addItem("7 Años o mas de servicio");

        labelResultado = new JLabel("Resultado del calculo");
        labelResultado.setBounds(220, 307, 180, 25);
        labelResultado.setFont(new Font("Andale Mono", 1, 12));
        labelResultado.setForeground(new Color(255, 255, 255));
        add(labelResultado);

        textArea1 = new JTextArea();
        textArea1.setEditable(false);
        textArea1.setBackground(new Color(224, 224, 224));
        textArea1.setFont(new Font("Andale Mono", 1, 12));
        textArea1.setForeground(new Color(255, 0, 0));
        textArea1.setText("\n    Aquin aparece el resultado del calculo de las vacaciones");
        scrollPane1 = new JScrollPane(textArea1);
        scrollPane1.setBounds(220, 333, 385, 90);
        add(scrollPane1);

        labelFooter = new JLabel("2022 The Coca-Cola Company | Todos los derechos reservados");
        labelFooter.setBounds(135, 445, 500, 30);
        labelFooter.setFont(new Font("Andale Mono", 1, 12));
        labelFooter.setForeground(new Color(255, 255, 255));
        add(labelFooter);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miCalculo) {
            String nombreTrabajador = txtNombreTrabajador.getText();
            String AP = txtAPaternoTrabajador.getText();
            String AM = txtAMaternoTrabajador.getText();
            String Departamento = comboDepartamento.getSelectedItem().toString();
            String Antiguedad = comboAntiguedad.getSelectedItem().toString();

            if (nombreTrabajador.equals("") || AP.equals("") || AM.equals("") ||
                    Departamento.equals("") || Antiguedad.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
            } else {
                if (Departamento.equals("Atencion al Cliente")) {
                    if (Antiguedad.equals("1 Año de Servicio")) {
                        textArea1.setText(
                                "\n    El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                        "\n    quien labora en " + Departamento + " con " + Antiguedad +
                                        "\n     recibe 6 dias de vacaciones.");
                    }
                    if (Antiguedad.equals("2 a 6 Años de Servicio")) {
                        textArea1.setText(
                                "\n    El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                        "\n    quien labora en " + Departamento + " con " + Antiguedad +
                                        "\n     recibe 14 dias de vacaciones.");
                    }
                    if (Antiguedad.equals("7 Años o mas de servicio")) {
                        textArea1.setText(
                                "\n    El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                        "\n    quien labora en " + Departamento + " con " + Antiguedad +
                                        "\n     recibe 20 dias de vacaciones.");
                    }
                }
                if (Departamento.equals("Departamento De Logistica")) {
                    if (Antiguedad.equals("1 Año de Servicio")) {
                        textArea1.setText(
                                "\n    El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                        "\n    quien labora en " + Departamento + " con " + Antiguedad +
                                        "\n     recibe 7 dias de vacaciones.");
                    }
                    if (Antiguedad.equals("2 a 6 Años de Servicio")) {
                        textArea1.setText(
                                "\n    El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                        "\n    quien labora en " + Departamento + " con " + Antiguedad +
                                        "\n     recibe 15 dias de vacaciones.");
                    }
                    if (Antiguedad.equals("7 Años o mas de servicio")) {
                        textArea1.setText(
                                "\n    El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                        "\n    quien labora en " + Departamento + " con " + Antiguedad +
                                        "\n     recibe 22 dias de vacaciones.");
                    }
                }
                if (Departamento.equals("Departamento De Gerencia")) {
                    if (Antiguedad.equals("1 Año de Servicio")) {
                        textArea1.setText(
                                "\n    El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                        "\n    quien labora en " + Departamento + " con " + Antiguedad +
                                        "\n     recibe 10 dias de vacaciones.");
                    }
                    if (Antiguedad.equals("2 a 6 Años de Servicio")) {
                        textArea1.setText(
                                "\n    El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                        "\n    quien labora en " + Departamento + " con " + Antiguedad +
                                        "\n     recibe 20 dias de vacaciones.");
                    }
                    if (Antiguedad.equals("7 Años o mas de servicio")) {
                        textArea1.setText(
                                "\n    El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                        "\n    quien labora en " + Departamento + " con " + Antiguedad +
                                        "\n     recibe 30 dias de vacaciones.");
                    }
                }
            }
        }
        if (e.getSource() == miRojo) {
            getContentPane().setBackground(new Color(255, 0, 0));
        }
        if (e.getSource() == miNegro) {
            getContentPane().setBackground(new Color(0, 0, 0));
        }
        if (e.getSource() == miMorado) {
            getContentPane().setBackground(new Color(51, 0, 51));
        }
        if (e.getSource() == miNuevo) {
            txtNombreTrabajador.setText("");
            txtAPaternoTrabajador.setText("");
            txtAMaternoTrabajador.setText("");
            comboDepartamento.setSelectedIndex(0);
            comboAntiguedad.setSelectedIndex(0);
            textArea1.setText("\n   Aqui aparece el resultado de las vacaciones.");
        }
        if (e.getSource() == miSalir) {
            Bienvenida ventanaBienvenida = new Bienvenida();
            ventanaBienvenida.setBounds(0, 0, 350, 450);
            ventanaBienvenida.setVisible(true);
            ventanaBienvenida.setResizable(false);
            ventanaBienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if (e.getSource() == MiElCreador) {
            JOptionPane.showMessageDialog(null, "Desarrollador Jonathan Alvarado \n" +
                    " Estudiante de Ingenieria De Software"
            );
        }
    }

    public static void main(String[] args) {
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0, 0, 640, 535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(true);
        ventanaPrincipal.setLocationRelativeTo(null);
    }
}
