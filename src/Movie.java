package src;

public class Movie {

    protected String Name;
    protected Integer Year;
    protected Double Time;
    protected String Type;

    public Movie(String Name, Integer Year, Double Time, String Type) {
       this.Name = Name;
       this.Year = Year;
       this.Time = Time;
       this.Type = Type;
    }

    public Movie() {
    }

    public Movie(Integer year, String name, Double time, String type) {
        Year = year;
        Name = name;
        Time = time;
        Type = type;
    }

    @Override
    public String toString() {
        return "****Movie****" +
                "\n~Name: '" + Name + '\'' +
                "\n~Year: " + Year +
                "\n~Time: " + Time +
                "\n~Type: '" + Type + '\'' ;
    }
}

