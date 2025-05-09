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

    double calcularPromedio() {
        double suma = 0;
        for (Double d : listaNotas) {
            suma += d;
        }
        return (suma / listaNotas.size());
    }

    double calcularPromedioStream() {
        return listaNotas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
    }

    double calcularDesviacion() {
        double prom = calcularPromedio();
        double suma = 0;
        for (Double d : listaNotas) {
            suma += Math.pow(d - prom, 2);
        }
        return Math.sqrt(suma / listaNotas.size());
    }

    double calcularDesviacionStream() {
        double prom = calcularPromedioStream();
        return Math.sqrt(listaNotas.stream()
                .mapToDouble(d -> Math.pow(d - prom, 2))
                .average()
                .orElse(0));
    }

    double calcularMenor() {
        double menor = listaNotas.get(0);
        for (Double d : listaNotas) {
            if (d < menor) {
                menor = d;
            }
        }
        return menor;
    }

    double calcularMenorStreams() {
        return listaNotas.stream()
                .mapToDouble(Double::doubleValue)
                .min()
                .orElse(Double.NaN);
    }

    double calcularMayor() {
        double mayor = listaNotas.get(0);
        for (Double d : listaNotas) {
            if (d > mayor) {

                mayor = d;
            }
        }
        return mayor;
    }

    double calcularMayorStreams() {
        return listaNotas.stream()
                .mapToDouble(Double::doubleValue)
                .max()
                .orElse(Double.NaN);
    }

}