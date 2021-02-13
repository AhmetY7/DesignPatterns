package factoryex2.factory;

import factoryex2.buttons.Button;
import factoryex2.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
