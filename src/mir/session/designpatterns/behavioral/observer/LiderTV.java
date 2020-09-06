package mir.session.designpatterns.behavioral.observer;

import java.beans.PropertyChangeEvent;

public class LiderTV extends Channel {
    @Override
    public void notifyMe() {
        System.out.println("LiderTV is notified...");
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        notifyMe();
    }
}
