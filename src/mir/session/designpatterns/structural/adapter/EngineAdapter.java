package mir.session.designpatterns.structural.adapter;

public class EngineAdapter implements Switch {

    private Engine engine;

    public EngineAdapter(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void turnOn() {
        engine.start();
    }

    @Override
    public void turnOff() {
        engine.stop();
    }
}
