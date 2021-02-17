package observerex2.publisher;

import observerex2.listeners.EventListener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
The Publisher issues events of interest to other objects. These events occur when the publisher changes its state
or executes some behaviors. Publishers contain a subscription infrastructure that lets new subscribers join and current
subscribers leave the list.
 */
/*
When a new event happens, the publisher goes over the subscription list and calls the notification method declared
in the subscriber interface on each subscriber object.
 */
public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, File file) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType, file);
        }
    }
}
