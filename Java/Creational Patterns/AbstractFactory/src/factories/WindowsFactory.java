package factories;

import factoryex2.buttons.Button;
import factoryex2.buttons.WindowsButton;
import checkboxes.Checkbox;
import checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
