package mir.session.designpatterns.behavioral.memento;

public class EditorSaverImpl implements EditorSaver {

    private EditorState editorState;

    @Override
    public void save(EditorState state) {
        this.editorState = state;
    }

    @Override
    public EditorState restore() {
        return editorState;
    }
}
