package mir.session.designpatterns.creational.prototype;

public class DataBaseService {
    public String getDefaultColorForTree() {
        System.out.println("DataBase connection...");
        System.out.println("Calculating...");
        return "Green";
    }
}
