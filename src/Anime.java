package src;

public class Anime extends Pelicula {

    protected String Studio;

    public Anime(String Name, Integer Year, Double Time, String Type, String Studio ) {
        super(Name, Year, Time, Type);
        this.Studio = Studio;

    }
}


