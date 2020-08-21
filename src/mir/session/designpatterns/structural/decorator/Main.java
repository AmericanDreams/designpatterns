package mir.session.designpatterns.structural.decorator;

public class Main {

    public static void main(String[] args) {

        /**
         * Funksionlliqlari extend etmek subclassingden ferqli alternativ hell teklif etmek lazimdir.
         * */

        Alarm simpleAlarm = new SimpleAlarm();
        Alarm jumpingAndScreamingAlarm = new JumpingAndScreamingAlarm();
        Alarm jumpingAlarm = new JumpingAlarm();

        simpleAlarm.makeSound();
        jumpingAndScreamingAlarm.makeSound();
        jumpingAlarm.makeSound();
    }
}
