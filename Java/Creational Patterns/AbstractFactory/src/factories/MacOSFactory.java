package factories;

import factoryex2.buttons.Button;
import factoryex2.buttons.MacOSButton;
import checkboxes.Checkbox;
import checkboxes.MacOSCheckbox;

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
