package mir.session.designpatterns.behavioral.memento;

public class Editor {

    private String text;

    private EditorSaver editorSaver = new EditorSaverImpl();

    public void write(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println(text);
    }

    public void save() {
        editorSaver.save(new EditorState(this.text));
    }

    public void restore() {
        EditorState restore = editorSaver.restore();
        text = restore.getText();
    }
}
