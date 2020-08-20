package mir.session.designpatterns.creational.prototype;

public class Tree {
    private String color;

    public Tree() {
        DataBaseService dataBaseService = new DataBaseService();
        color = dataBaseService.getDefaultColorForTree();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "color='" + color + '\'' +
                '}';
    }
}
