package abstractfacex2.factories;

import abstractfacex2.buttons.Button;
import abstractfacex2.buttons.WindowsButton;
import abstractfacex2.checkboxes.Checkbox;
import abstractfacex2.checkboxes.WindowsCheckbox;

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
