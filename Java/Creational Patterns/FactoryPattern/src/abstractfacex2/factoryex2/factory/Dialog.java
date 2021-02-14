package abstractfacex2.factoryex2.factory;

import abstractfacex2.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }
    public abstract Button createButton();

}
