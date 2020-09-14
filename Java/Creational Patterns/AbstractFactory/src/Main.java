import app.Application;
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

/**
 * Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.
 *
 * Use the Abstract Factory when your code needs to work with various families of related products,
 * but you don’t want it to depend on the concrete classes of those products—they might be unknown beforehand or
 * you simply want to allow for future extensibility.
 */

public class Main {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }
}
