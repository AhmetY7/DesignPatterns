package abstractfacex2.factoryex2.factory;

import abstractfacex2.buttons.Button;
import abstractfacex2.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
