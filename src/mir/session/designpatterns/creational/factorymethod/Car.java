package mir.session.designpatterns.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private List<Wheel> wheels = new ArrayList<>();

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                '}';
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public Car(List<Wheel> wheels) {
        this.wheels = wheels;
    }
}
