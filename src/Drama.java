package src;

public class Drama extends Pelicula{

    protected String DramaType;


    public Drama(String Name, Integer Year, Double Time, String Type,String DramaType) {
        super(Name, Year, Time, Type);
        this.DramaType = DramaType;

    }
}

