import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

/**
 * Esta clase denominada VentanaPrincipal define una interfaz gráfica
 * que permitirá crear un array de notas. Luego, se puede calcular el
 * promedio de notas, la desviación, la nota mayor y la nota menor del array.
 * 
 * @version 1.2/2020
 */
public class VentanaPrincipal extends JFrame implements ActionListener {

    // Un contenedor de elementos gráficos
    private Container contenedor;

    // Etiquetas estáticas de cada nota
    private JLabel nota, promedio, desviación, mayor, menor;

    // Campos de ingreso de cada nota
    private JTextField campoNota;

    // Botones para realizar cálculos y para borrar las notas
    private JButton calcular, limpiar, anadir, eliminar;

    private Notas lista;
    private JList<Double> listaNotas;
    private DefaultListModel<Double> modelo;
    private JScrollPane scrollLista;

    /**
     * Constructor de la clase VentanaPrincipal
     */
    public VentanaPrincipal() {
        lista = new Notas();
        inicio();
        setTitle("Notas"); // Establece el título de la ventana
        setSize(280, 380); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); // La ventana se posiciona en el centro de la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar aplicación al salir
        setResizable(false); // El tamaño de la ventana no se puede cambiar
    }

    /**
     * Método que crea la ventana con sus diferentes componentes gráficos
     */
    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        nota = new JLabel("Nota :");
        nota.setBounds(50, 20, 135, 23);
        campoNota = new JTextField();
        campoNota.setBounds(115, 20, 135, 23);

        // Botón Añadir
        anadir = new JButton("Añadir");
        anadir.setBounds(20, 50, 90, 23);
        anadir.addActionListener(this);

        // Botón eliminar
        eliminar = new JButton("Eliminar");
        eliminar.setBounds(20, 90, 90, 23);
        eliminar.addActionListener(this);

        calcular = new JButton("Calcular");
        calcular.setBounds(20, 170, 90, 23);
        calcular.addActionListener(this);

        limpiar = new JButton("Limpiar");
        limpiar.setBounds(20, 130, 90, 23);
        limpiar.addActionListener(this);

        promedio = new JLabel("Promedio = ");
        promedio.setBounds(20, 210, 135, 23);

        desviación = new JLabel("Desviación = ");
        desviación.setBounds(20, 240, 200, 23);

        mayor = new JLabel("Nota mayor = ");
        mayor.setBounds(20, 270, 120, 23);

        menor = new JLabel("Nota menor = ");
        menor.setBounds(20, 300, 120, 23);

        // Lista de Notas -- aqui es donde tuve que preguntar a gepeto, no me salió hacerlo yo D:
        modelo = new DefaultListModel<>();
        listaNotas = new JList<>(modelo); // esta linea de mierda me la tuvo que dar gepeto y no entiendo porque es asi pero funciona
        listaNotas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollLista = new JScrollPane(listaNotas);
        scrollLista.setBounds(115, 50, 135, 150);

        contenedor.add(nota);
        contenedor.add(campoNota);
        contenedor.add(calcular);
        contenedor.add(limpiar);
        contenedor.add(promedio);
        contenedor.add(desviación);
        contenedor.add(mayor);
        contenedor.add(menor);

        contenedor.add(scrollLista);
        contenedor.add(anadir);
        contenedor.add(eliminar);
    }

    /**
     * Método que gestiona los eventos generados en la ventana principal
     */
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcular) {
            promedio.setText("Promedio = " + String.format("%.2f", lista.calcularPromedio()));
            desviación.setText("Desviación estándar = " + String.format("%.2f", lista.calcularDesviacion()));
            mayor.setText("Valor mayor = " + lista.calcularMayor());
            menor.setText("Valor menor = " + lista.calcularMenor());
        } else if (evento.getSource() == anadir) {
            anadirNota();
        } else if (evento.getSource() == limpiar) {
            borrarLista();
        } else if (evento.getSource() == eliminar) {
            eliminarNota(listaNotas.getSelectedIndex());
        }

    }

    private void anadirNota() {
        double valor = Double.parseDouble(campoNota.getText());
        lista.anadirNota(valor);
        modelo.addElement(valor);
        campoNota.setText("");
    }

    private void eliminarNota(int indice) {
        if (indice >= 0) {
            modelo.removeElementAt(indice);
            lista.eliminarNota(indice);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void borrarLista() {
        lista.borrarLista();
        modelo.clear();
    }

}
