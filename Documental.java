public class Documental extends Pelicula {

    protected String categoriaDocumental;

    public Documental(String nombre, int año, int duracion, String tipo, String categoriaDocumental) {
        super(nombre, año, duracion, "Documental");
        this.categoriaDocumental = categoriaDocumental;
    }
}
