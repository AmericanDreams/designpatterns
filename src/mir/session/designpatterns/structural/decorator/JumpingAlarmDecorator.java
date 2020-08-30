package mir.session.designpatterns.structural.decorator;

public class JumpingAlarmDecorator extends AlarmDecorator {

    public JumpingAlarmDecorator(Alarm alarm) {
        super(alarm);
    }

    @Override
    public void makeSound() {
        getAlarm().makeSound();
        System.out.println("Starting jumping...");
    }
}
