import java.util.ArrayList;

public class Notas {

    ArrayList<Double> listaNotas;

    public ArrayList<Double> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Double> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public Notas() {
        listaNotas = new ArrayList<Double>();
    }

    // tuve estupidos problemas con esto por tonto
    public void anadirNota(double valor) {
        listaNotas.add(valor);
    }

    // con estas ya no tuve problemas almenos, entre otras cosas porque son copia pega de personas
    public void borrarLista() {
        listaNotas.removeAll(listaNotas);
    }

        public void eliminarNota(int i) {
        listaNotas.remove(i);
    }

    double calcularPromedio() {
        return listaNotas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
    }

    double calcularDesviacion() {
        double prom = calcularPromedio();
        return Math.sqrt(listaNotas.stream()
                .mapToDouble(d -> Math.pow(d - prom, 2))
                .average()
                .orElse(0));
    }

    double calcularMenor() {
        return listaNotas.stream()
                .mapToDouble(Double::doubleValue)
                .min()
                .orElse(Double.NaN);
    }

    double calcularMayor() {
        return listaNotas.stream()
                .mapToDouble(Double::doubleValue)
                .max()
                .orElse(Double.NaN);
    }
}