import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ventanaputacosa extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel altura, anchura, largura, volumen, superficie;
    private JTextField campoAltura, campoanchura, campolargura;
    private JButton calcular;

    public Ventanaputacosa() {
        inicio();
        setTitle("Paralelepípedo ");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        altura = new JLabel("Altura (cms):");
        altura.setBounds(20, 20, 135, 23);
        campoAltura = new JTextField();
        campoAltura.setBounds(160, 20, 135, 23);

        anchura = new JLabel("Anchura (cms):");
        anchura.setBounds(20, 50, 135, 23);
        campoanchura = new JTextField();
        campoanchura.setBounds(160, 50, 135, 23);

        largura = new JLabel("Largura (cms):");
        largura.setBounds(20, 80, 135, 23);
        campolargura = new JTextField();
        campolargura.setBounds(160, 80, 135, 23);

        calcular = new JButton("Calcular");
        calcular.setBounds(100, 110, 135, 23);
        calcular.addActionListener(this);

        volumen = new JLabel("Volumen (cm3):");
        volumen.setBounds(20, 140, 135, 23);

        superficie = new JLabel("Superficie (cm2):");
        superficie.setBounds(20, 180, 135, 23);

        contenedor.add(altura);
        contenedor.add(campoAltura);
        contenedor.add(anchura);
        contenedor.add(campoanchura);
        contenedor.add(largura);
        contenedor.add(campolargura);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        boolean error = false;
        double altura = 0;
        double anchura = 0;
        double largura = 0;

        try {
            altura = Double.parseDouble(campoAltura.getText());
            anchura = Double.parseDouble(campoanchura.getText());
            largura = Double.parseDouble(campolargura.getText());

            paralelepipedo paralelepipedo = new paralelepipedo(largura, anchura, altura);

            volumen.setText("Volumen (cm3): " + String.format("%.2f", paralelepipedo.calcularVolumen()));
            superficie.setText("Superficie (cm2): " + String.format("%.2f", paralelepipedo.calcularSuperficie()));

        } catch (Exception e) {
            error = true;
        } finally {
            if (error) {
                JOptionPane.showMessageDialog(null,
                        "Campo nulo o error en formato de número",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
