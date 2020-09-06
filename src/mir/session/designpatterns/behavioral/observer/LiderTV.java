package mir.session.designpatterns.behavioral.observer;

public class LiderTV extends Channel {
    @Override
    public void notifyMe() {
        System.out.println("LiderTV is notified...");
    }
}
