package mir.session.designpatterns.behavioral.template;

public class LinuxFileSaver extends FileSaver {
    @Override
    public void compress() {
        System.out.println("Linux is compressing...");
    }

    @Override
    public void writeToDataBase() {
        System.out.println("Linux is saving");
    }
}
