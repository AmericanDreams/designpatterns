package mir.session.designpatterns.behavioral.observer;

public class AzTV extends Channel {
    @Override
    public void notifyMe() {
        System.out.println("AzTV is notified...");
    }
}
