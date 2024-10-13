package src;

public class Documental extends Pelicula {

    protected String DocumentalCategory;

    public Documental(String Name, Integer Year, Double Time, String Type,String DocumentalCategory) {
        super(Name, Year, Time, Type);
        this.DocumentalCategory = DocumentalCategory;

    }
}

