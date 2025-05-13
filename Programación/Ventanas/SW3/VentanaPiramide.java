import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPiramide extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel base, altura, apotema, volumen, superficie;
    private JTextField campoBase, campoAltura, campoApotema;
    private JButton calcular;

    public VentanaPiramide() {
        inicio();
        setTitle("Pirámide");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        base = new JLabel("Base (cms):");
        base.setBounds(20, 20, 135, 23);
        campoBase = new JTextField();
        campoBase.setBounds(140, 20, 120, 23);

        altura = new JLabel("Altura (cms):");
        altura.setBounds(20, 50, 135, 23);
        campoAltura = new JTextField();
        campoAltura.setBounds(140, 50, 120, 23);

        apotema = new JLabel("Apotema (cms):");
        apotema.setBounds(20, 80, 135, 23);
        campoApotema = new JTextField();
        campoApotema.setBounds(140, 80, 120, 23);
        campoApotema.setEnabled(false);

        calcular = new JButton("Calcular");
        calcular.setBounds(140, 110, 120, 23);
        calcular.addActionListener(this);

        volumen = new JLabel("Volumen (cm3):");
        volumen.setBounds(20, 150, 250, 23);

        superficie = new JLabel("Superficie (cm2):");
        superficie.setBounds(20, 180, 250, 23);

        contenedor.add(base);
        contenedor.add(campoBase);
        contenedor.add(altura);
        contenedor.add(campoAltura);
        contenedor.add(apotema);
        contenedor.add(campoApotema);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        boolean error = false;
        double base = 0;
        double altura = 0;
        double apotema = 0;

        try {
            base = Double.parseDouble(campoBase.getText());
            altura = Double.parseDouble(campoAltura.getText());
            apotema = Double.parseDouble(campoApotema.getText());

            Piramide piramide = new Piramide(base, altura, apotema);

            volumen.setText("Volumen (cm3): " + String.format("%.2f", piramide.calcularVolumen()));
            superficie.setText("Superficie (cm2): " + String.format("%.2f", piramide.calcularSuperficie()));
            campoApotema.setText(String.valueOf(piramide.getApotema()));


        } catch (Exception e) {
            error = true;
        } finally {
            if (error) {
                JOptionPane.showMessageDialog(null,
                        "Campo nulo o error en formato de número",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
