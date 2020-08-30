package mir.session.designpatterns.structural.decorator;

public class Main {

    public static void main(String[] args) {

        /**
         * Funksionlliqlari extend etmek subclassingden ferqli alternativ hell teklif etmek lazimdir.
         * */

        JumpingAlarmDecorator jumpingAlarmDecorator = new JumpingAlarmDecorator(new ScreamingAlarm());
        jumpingAlarmDecorator.makeSound();

        JumpingAlarmDecorator jumpingSimpleAlaram = new JumpingAlarmDecorator(new SimpleAlarm());
        jumpingSimpleAlaram.makeSound();
    }
}
