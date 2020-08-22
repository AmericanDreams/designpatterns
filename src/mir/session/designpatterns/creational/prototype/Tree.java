package mir.session.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Tree implements Cloneable {
    private String color;
    private List<String> leafs = new ArrayList<>();

    public Tree() {
        DataBaseService dataBaseService = new DataBaseService();
        color = dataBaseService.getDefaultColorForTree();
        leafs = dataBaseService.getLeafs();
    }

    private Tree(Tree tree) {
        this.color = tree.color;
        this.leafs = new ArrayList<>(tree.getLeafs());
    }

    @Override
    protected Tree clone() throws CloneNotSupportedException {
        Tree tree = new Tree(this);
        return tree;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<String> getLeafs() {
        return leafs;
    }

    public void setLeafs(List<String> leafs) {
        this.leafs = leafs;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "color='" + color + '\'' +
                ", leafs=" + leafs +
                '}';
    }
}
