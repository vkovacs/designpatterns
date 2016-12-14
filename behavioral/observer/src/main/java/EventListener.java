import enums.Event;
import interfaces.Subject;
import interfaces.Observer;

/**
 * Listen events from Event source (PULL model, where the state is get from the subject by the observer)
 */
public class EventListener implements Observer {

    /**
     * The subject the events are received from
     */
    private Subject subject;

    /**
     * Event received by subject
     */
    private Event event;

    public EventListener(final Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        if (subject instanceof EventSource) {
            EventSource eventSource = (EventSource) subject;
            event = eventSource.getState();
            display();
        }
    }

    private void display() {
        System.out.println(event);
    }

    public Event getEvent() {
        return event;
    }
}
