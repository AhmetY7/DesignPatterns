package abstractfacex2.factories;

import abstractfacex2.buttons.Button;
import abstractfacex2.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
