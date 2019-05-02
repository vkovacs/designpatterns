package hu.crs.designpatterns.behavioral.observer;

import hu.crs.designpatterns.behavioral.observer.enums.Event;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ObserverTest {

    @Test
    public void testObserversReceiveUpdate() {
        EventSource subject = new EventSource();

        EventListener observer0 = new EventListener(subject);
        EventListener observer1 = new EventListener(subject);
        EventListener observer2 = new EventListener(subject);

        subject.addObserver(observer0);
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        List<EventListener> eventListeners = Arrays.asList(observer0, observer1, observer2);

        subject.setState(Event.LEFT_CLICK);
        subject.notifyObservers();

        for (EventListener eventListener : eventListeners) {
            assertEquals(eventListener.getEvent(), Event.LEFT_CLICK);
        }

        subject.setState(Event.RIGHT_CLICK);
        subject.notifyObservers();

        for (EventListener eventListener : eventListeners) {
            assertEquals(eventListener.getEvent(), Event.RIGHT_CLICK);
        }
    }

}
