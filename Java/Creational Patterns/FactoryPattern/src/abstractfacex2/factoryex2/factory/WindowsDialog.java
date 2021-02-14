package abstractfacex2.factoryex2.factory;

import abstractfacex2.buttons.Button;
import abstractfacex2.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
