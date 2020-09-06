package mir.session.designpatterns.behavioral.template;

public abstract class FileSaver {
    protected abstract void compress();
    protected abstract void writeToDataBase();

    public void save() {
        compress();
        writeToDataBase();
    }

}
