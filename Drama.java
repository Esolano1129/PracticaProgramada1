public class Drama extends Pelicula{

    protected String tipoDrama;

    public Drama(String nombre, int año, int duracion, String tipo, String tipoDrama) {
        super(nombre, año, duracion, "Drama");
        this.tipoDrama = tipoDrama;
    }

}
