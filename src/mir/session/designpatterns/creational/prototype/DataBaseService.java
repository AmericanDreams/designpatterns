package mir.session.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class DataBaseService {
    public String getDefaultColorForTree() {
        System.out.println("DataBase connection...");
        System.out.println("Calculating...");
        return "Green";
    }

    public List<String> getLeafs() {
        List<String> leafs = new ArrayList<>();
        leafs.add("leaf1");
        leafs.add("leaf2");
        leafs.add("leaf3");
        return leafs;
    }
}
