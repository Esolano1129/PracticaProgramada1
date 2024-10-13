public class Anime extends Pelicula{

    protected String estudio;

    public Anime(String nombre, int año, int duracion, String tipo, String estudio) {
        super(nombre, año, duracion, "Anime");
        this.estudio = estudio;
    }

}
