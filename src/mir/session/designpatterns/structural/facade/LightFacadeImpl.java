package mir.session.designpatterns.structural.facade;

public class LightFacadeImpl implements LightFacade {

    private Generator generator;
    private Light light;

    public LightFacadeImpl(Generator generator, Light light) {
        this.generator = generator;
        this.light = light;
    }

    @Override
    public void lightTurnOn() {
        generator.start();
        light.turnOn();
    }

    @Override
    public void lightTurnOff() {
        light.turnOff();
        generator.stop();
    }
}
