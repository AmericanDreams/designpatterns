package mir.session.designpatterns.structural.decorator;

public class JumpingAlarm implements Alarm {
    @Override
    public void makeSound() {
        System.out.println("Started jumping...");
    }
}
