package mir.session.designpatterns.behavioral.memento;

public class Editor {
    private String text;

    private String savedText;

    public void write(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println(text);
    }

    public void save() {
        savedText = text;
    }

    public void restore() {
        text = savedText;
    }
}
