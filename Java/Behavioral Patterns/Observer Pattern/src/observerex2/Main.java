package observerex2;

import observerex2.editor.Editor;
import observerex2.listeners.EmailNotificationListener;
import observerex2.listeners.LogOpenListener;

public class Main {
    /*
    Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects
    about any events that happen to the object they’re observing.
     */
    /*
    Use the Observer pattern when changes to the state of one object may require changing other objects, and the
    actual set of objects is unknown beforehand or changes dynamically.
     */
    /*
    Use the pattern when some objects in your app must observe others, but only for a limited time or in specific cases.
     */
    public static void main(String[] args) {
        /*
        The Client creates publisher and subscriber objects separately and then registers subscribers
        for publisher updates.
         */
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
