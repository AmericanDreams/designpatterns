package mir.session.designpatterns.structural.decorator;

public class JumpingAndScreamingAlarm extends ScreamingAlarm {

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Started to jump...");
    }
}
