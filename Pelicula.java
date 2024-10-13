public class Pelicula {
    protected String nombre;
    protected int año;
    protected int duracion;
    protected String tipo;

    public Pelicula(String nombre, int año, int duracion, String tipo){
        this.nombre = nombre;
        this.año = año;
        this.duracion = duracion;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String mostrarInfo(){
        return "Nombre: " + nombre + "\n" + "Año: " + año + "\n" + "Duración: " + duracion + "\n" + "Tipo: " + tipo;
    }

}