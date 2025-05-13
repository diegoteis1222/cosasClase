import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private Container contenedor;
    private JButton cilindro, esfera, piramide, paralelepipedo;

    public VentanaPrincipal() {
        inicio();
        setTitle("Figuras");
        setSize(350, 160);
        setLocationRelativeTo(cilindro);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        cilindro = new JButton();
        cilindro.setText("Cilindro");
        cilindro.setBounds(20, 50, 80, 23);
        cilindro.addActionListener(this);

        esfera = new JButton();
        esfera.setText("Esfera");
        esfera.setBounds(125, 50, 80, 23);
        esfera.addActionListener(this);

        piramide = new JButton();
        piramide.setText("Piramide");
        piramide.setBounds(225, 50, 100, 23);
        piramide.addActionListener(this);

        paralelepipedo = new JButton();
        paralelepipedo.setText("Paralelepipedo");
        paralelepipedo.setBounds(125, 80, 120, 23);
        paralelepipedo.addActionListener(this);

        contenedor.add(cilindro);
        contenedor.add(esfera);
        contenedor.add(piramide);
        contenedor.add(paralelepipedo);

    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == esfera) {
            VentanaEsfera esfera = new VentanaEsfera();
            esfera.setVisible(true);
        }
        if (evento.getSource() == cilindro) {
            VentanaCilindro cilindro = new VentanaCilindro();
            cilindro.setVisible(true);
        }
        if (evento.getSource() == piramide) {
            VentanaPiramide piramide = new VentanaPiramide();
            piramide.setVisible(true);
        }
        if (evento.getSource() == paralelepipedo) {
            Ventanaputacosa paralelepipedo = new Ventanaputacosa();
            paralelepipedo.setVisible(true);
        }
    }

}
