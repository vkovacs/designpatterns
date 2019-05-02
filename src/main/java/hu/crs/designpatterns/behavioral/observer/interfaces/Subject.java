package hu.crs.designpatterns.behavioral.observer.interfaces;

public interface Subject {

    /**
     * Notify observers about state change
     */
    void notifyObservers();

    /**
     * Add subscriber
     * @param observer Subscriber to add
     */
    void addObserver(Observer observer);

    /**
     * Remove subscriber
     * @param observer Subscriber to remove
     */
    void removeObserver(Observer observer);
}
