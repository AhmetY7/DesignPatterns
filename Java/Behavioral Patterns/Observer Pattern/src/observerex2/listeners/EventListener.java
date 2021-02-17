package observerex2.listeners;

import java.io.File;

/*
The Subscriber interface declares the notification interface. In most cases, it consists of a single update method.
The method may have several parameters that let the publisher pass some event details along with the update.
 */
public interface EventListener {
    void update(String eventType, File file);
}
