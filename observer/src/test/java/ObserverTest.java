import enums.Event;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ObserverTest {

    @Test
    void testObserversReceiveUpdate() {
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
            Assert.assertEquals(eventListener.getEvent(), Event.LEFT_CLICK);
        }

        subject.setState(Event.RIGHT_CLICK);
        subject.notifyObservers();

        for (EventListener eventListener : eventListeners) {
            Assert.assertEquals(eventListener.getEvent(), Event.RIGHT_CLICK);
        }
    }

}