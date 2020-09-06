package mir.session.designpatterns.behavioral.observer;

import java.beans.PropertyChangeListener;

public abstract class Channel implements PropertyChangeListener {
    public abstract void notifyMe();
}
