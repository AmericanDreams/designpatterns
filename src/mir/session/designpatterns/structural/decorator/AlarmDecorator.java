package mir.session.designpatterns.structural.decorator;


public abstract class AlarmDecorator implements Alarm {

    private Alarm alarm;

    public AlarmDecorator(Alarm alarm) {
        this.alarm = alarm;
    }

    public abstract void makeSound();

    public Alarm getAlarm() {
        return alarm;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }
}
