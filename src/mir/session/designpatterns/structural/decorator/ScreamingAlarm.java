package mir.session.designpatterns.structural.decorator;

public class ScreamingAlarm extends SimpleAlarm {

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Alaaaaaaaaaaaaaaaaa");
    }
}
