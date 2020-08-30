package mir.session.designpatterns.structural.facade;

public class GeneratorImpl implements Generator {

    @Override
    public void start() {
        System.out.println("Genartor is started...");
    }

    @Override
    public void stop() {
        System.out.println("Genartor is stopped...");
    }
}
