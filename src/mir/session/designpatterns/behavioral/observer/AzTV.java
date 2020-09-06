package mir.session.designpatterns.behavioral.observer;

import java.beans.PropertyChangeEvent;

public class AzTV extends Channel {
    @Override
    public void notifyMe() {
        System.out.println("AzTV is notified...");
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println( " OLD VALUE " + evt.getOldValue());
        notifyMe();
    }
}
