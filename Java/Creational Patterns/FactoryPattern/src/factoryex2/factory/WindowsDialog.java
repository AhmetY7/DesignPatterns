package factoryex2.factory;

import factoryex2.buttons.Button;
import factoryex2.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
