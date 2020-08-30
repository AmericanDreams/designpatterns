package mir.session.designpatterns.structural.decorator;

public class SimpleAlarm implements Alarm {
    @Override
    public void makeSound() {
        System.out.println("Heyoooo");
    }
}
