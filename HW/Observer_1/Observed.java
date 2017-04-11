package Observer_1;

/**
 * Created by toor on 11.04.17.
 */
public interface Observed {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
