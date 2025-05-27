public class testMain {

    public static void main(String[] args) {

        Departamento departamento = new Departamento("Pontevedra");

        System.out.println("El censo del Departamento es " + departamento.getNombre() + " es "
                + departamento.calcularCensoPoblacionDepartamento());
        System.out.println("Municipios con poblacion mayor a 50.000 ");
        departamento.buscarMunicipioConPoblacionMayor(500000);

    }

}
