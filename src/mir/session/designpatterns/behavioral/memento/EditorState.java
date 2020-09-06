package mir.session.designpatterns.behavioral.memento;

public class EditorState {
    private String text;

    public EditorState(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
