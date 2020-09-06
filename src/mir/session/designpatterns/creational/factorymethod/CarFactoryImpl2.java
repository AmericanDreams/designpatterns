package mir.session.designpatterns.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class CarFactoryImpl2 implements CarFactory {
    @Override
    public Car createInstance() {
        List<Wheel> wheels = new ArrayList<>();
        wheels.add(new Wheel());
        wheels.add(new Wheel());
        wheels.add(new Wheel());

        Car car1 = new Car(wheels);
        return car1;
    }
}
