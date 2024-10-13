package src;

public class Drama extends Category implements Utilities{

    protected String DramaType;


    public Drama(String Name, Integer Year, Double Time, String Type,String DramaType) {
        super(Name, Year, Time, Type);
        this.DramaType = DramaType;

    }

    @Override
    public void Add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void Edit() {

    }

    @Override
    public void Save() {

    }

    @Override
    public void Search() {

    }

    @Override
    public void Filter() {

    }

    @Override
    public void AddToFavorite() {

    }

    @Override
    public void SeeDetails() {

    }

    @Override
    public void addComment() {

    }

    @Override
    public void DeleteComment() {

    }

    @Override
    public void Play() {

    }

    @Override
    public void BackToMenu() {

    }

    @Override
    public void GetNotifications(){

    }


    @Override
    public String GetCategory() {
        return "";
    }

    @Override
    public String SetCategory() {
        return "";
    }

    @Override
    public void EditCategory() {

    }

    @Override
    public void DeleteCategory() {

    }
}

