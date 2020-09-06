package mir.session.designpatterns.behavioral.observer;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class NewsAgent {

    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void insertNews(String news) {

        //refrefrefre
        notifyAllChannels();

    }

    public void notifyAllChannels() {
        support.firePropertyChange("news", "ref" , null);
    }

    public void addChannel(Channel channel) {
        support.addPropertyChangeListener(channel);
    }

    public void removeChannel(Channel channel) {
        support.removePropertyChangeListener(channel);
    }
}
