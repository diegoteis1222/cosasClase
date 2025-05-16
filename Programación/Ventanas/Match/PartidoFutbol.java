public interface PartidoFutbol extends MatchDeportivo {

    static final int duracionPartidoFutbol = 90;

    void setGolesEquipoLocal(int marcador);

    void setGolesEquipoVisitante(int marcador);
}
