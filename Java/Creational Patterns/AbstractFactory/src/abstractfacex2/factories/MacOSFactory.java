package abstractfacex2.factories;

import abstractfacex2.buttons.Button;
import abstractfacex2.buttons.MacOSButton;
import abstractfacex2.checkboxes.Checkbox;
import abstractfacex2.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
