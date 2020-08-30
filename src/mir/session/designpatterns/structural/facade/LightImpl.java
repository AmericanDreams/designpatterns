package mir.session.designpatterns.structural.facade;

public class LightImpl implements Light {
    @Override
    public void turnOn() {
        System.out.println("Light is turned on..");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned off..");
    }
}
