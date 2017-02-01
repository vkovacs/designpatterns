package hu.crs.designpatterns.behavioral.observer;

import hu.crs.designpatterns.behavioral.observer.enums.Event;
import hu.crs.designpatterns.behavioral.observer.interfaces.Observer;
import hu.crs.designpatterns.behavioral.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Broadcast events to subscribers
 */
public class EventSource implements Subject {

    /**
     * Ubservers subscribed for events
     */
    private List<Observer> subscribers;

    /**
     * Event (state) which will be broadcasted
     */
    private Event state;

    public EventSource() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.update();
        }
    }

    @Override
    public void addObserver(final Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(final Observer observer) {
        final int i = subscribers.indexOf(observer);
        if (i > 0) {
            subscribers.remove(i);
        }
    }

    public Event getState() {
        return state;
    }

    public void setState(final Event state) {
        this.state = state;
    }
}
