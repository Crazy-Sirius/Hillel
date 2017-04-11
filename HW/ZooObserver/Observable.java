package ZooObserver;

import Observer_1.Observer;

/**
 * Created by toor on 11.04.17.
 */
public interface Observable {

    public void subscribe (ZooObserver.Observer observer);
    public void unsubscribe (ZooObserver.Observer observer);
    public void notifySubscribers (String event);
}
