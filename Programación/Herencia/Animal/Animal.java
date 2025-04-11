public abstract class Animal {

    protected String sonido;
    protected String alimentos;
    protected String habitat;
    protected String nombreCientifico;

    public abstract String getSonido();

    public abstract String getAlimentos();

    public abstract String getHabitat();

    public abstract String getNombreCientifico();

    @Override
    public String toString() {
        return "Animal [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombreCientifico="
                + nombreCientifico + "]";
    }

    
}
