package src;

public abstract class Category extends Movie {
    public Category(String Name, Integer Year, Double Time, String Type) {
        super(Name, Year, Time, Type);
    }

    public abstract String GetCategory();


    public abstract String SetCategory();


    public abstract void EditCategory();


    public abstract void DeleteCategory();


}
