package observerex2.listeners;

import java.io.File;

/*
Concrete Subscribers perform some actions in response to notifications issued by the publisher. All of these classes
must implement the same interface so the publisher isn’t coupled to concrete classes.
 */
/*
Usually, subscribers need some contextual information to handle the update correctly. For this reason, publishers
often pass some context data as arguments of the notification method. The publisher can pass itself as an argument,
letting subscriber fetch any required data directly.
 */
public class LogOpenListener implements EventListener {
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
