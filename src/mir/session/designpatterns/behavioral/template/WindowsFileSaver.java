package mir.session.designpatterns.behavioral.template;

public class WindowsFileSaver extends FileSaver{
    @Override
    public void compress() {
        System.out.println("Windows is compressing...");
    }

    @Override
    public void writeToDataBase() {
        System.out.println("Windows is saving");
    }
}
