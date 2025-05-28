import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private Container contenedor;
    private ListaEmpleados empleados;
    private JMenuBar barraMenu;
    private JMenu menuOpciones;
    private JMenuItem itemMenu1;
    private JMenuItem itemMenu2;
    private JMenuItem itemMenu3;

    public VentanaPrincipal() {
        empleados = new ListaEmpleados(); // Se crea la lista de empleados
        inicio();
        setTitle("Nómina"); // Título de la ventana
        setSize(280, 380); // Tamaño de la ventana
        setLocationRelativeTo(null); // Centrar ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la app al salir
        setResizable(false); // No redimensionable
    }

    /**
     * Crea la interfaz gráfica de la ventana principal
     */
    public void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        // Crear barra de menú y sus opciones
        barraMenu = new JMenuBar();
        menuOpciones = new JMenu("Menú");
        itemMenu1 = new JMenuItem("Agregar empleado");
        itemMenu2 = new JMenuItem("Calcular nómina");
        itemMenu3 = new JMenuItem("Guardar archivo");

        // Agregar ítems al menú
        menuOpciones.add(itemMenu1);
        menuOpciones.add(itemMenu2);
        menuOpciones.add(new JSeparator());
        menuOpciones.add(itemMenu3);

        barraMenu.add(menuOpciones);
        setJMenuBar(barraMenu);

        // Agregar eventos
        itemMenu1.addActionListener(this);
        itemMenu2.addActionListener(this);
        itemMenu3.addActionListener(this);
    }

    /**
     * Maneja las acciones de los ítems del menú
     */
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == itemMenu1) {
            VentanaAgregarEmpleado ventanaAgregar = new VentanaAgregarEmpleado(empleados);
            ventanaAgregar.setVisible(true);
        }

        if (evento.getSource() == itemMenu2) {
            VentanaNomina ventanaNomina = new VentanaNomina(empleados);
            ventanaNomina.setVisible(true);
        }

        if (evento.getSource() == itemMenu3) {
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            int respuesta = fc.showOpenDialog(this);
            if (respuesta == JFileChooser.APPROVE_OPTION) {
                File directorioElegido = fc.getSelectedFile();
                String ruta = directorioElegido.getAbsolutePath();

                try {
                    String contenido = empleados.convertirTexto();
                    File file = new File(ruta + File.separator + "Nomina.txt");
                    file.createNewFile();

                    FileWriter fw = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(contenido);
                    bw.close();

                    JOptionPane.showMessageDialog(this,
                            "El archivo 'Nomina.txt' se ha creado en:\n" + ruta,
                            "Archivo guardado",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this,
                            "Error al guardar el archivo:\n" + e.getMessage(),
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
            }
        }
    }
}
