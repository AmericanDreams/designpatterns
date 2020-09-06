package mir.session.designpatterns.behavioral.memento;

public interface EditorSaver {
    void save(EditorState state);
    EditorState restore();
}
