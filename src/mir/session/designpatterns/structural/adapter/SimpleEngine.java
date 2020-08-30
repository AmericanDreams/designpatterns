package mir.session.designpatterns.structural.adapter;

public class SimpleEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Engine is started working..");
    }

    @Override
    public void stop() {
        System.out.println("Engine is stopped working..");
    }
}
