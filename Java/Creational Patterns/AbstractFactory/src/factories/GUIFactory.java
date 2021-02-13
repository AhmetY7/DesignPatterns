package factories;

import factoryex2.buttons.Button;
import checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
