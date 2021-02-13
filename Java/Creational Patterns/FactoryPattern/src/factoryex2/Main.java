package factoryex2;

import factoryex2.factory.Dialog;
import factoryex2.factory.WindowsDialog;
import factoryex2.factory.HtmlDialog;
/**
 *Factory Method is a creational design pattern that provides an interface for creating objects in a superclass,
 * but allows subclasses to alter the type of objects that will be created.
 *
 * The Factory Method pattern suggests that you replace direct object construction calls (using the new operator) with calls to a special factoryex2.factory method.
 * Don’t worry: the objects are still created via the new operator,
 * but it’s being called from within the factoryex2.factory method. Objects returned by a factoryex2.factory method are often referred to as products.
 *
 * Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with.
 * Use the Factory Method when you want to provide users of your library or framework with a way to extend its internal components.
 * Use the Factory Method when you want to save system resources by reusing existing objects instead of rebuilding them each time.
 */
public class Main {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        // factoryex2.Main ConcreteCreator u çağırıyor. ConcreteCreator ise interface aracılığıyla ConcreteProduct u çağırıyor.
        if(System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
