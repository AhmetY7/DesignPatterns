package abstractfacex2.app;

import abstractfacex2.buttons.Button;
import abstractfacex2.checkboxes.Checkbox;
import abstractfacex2.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
