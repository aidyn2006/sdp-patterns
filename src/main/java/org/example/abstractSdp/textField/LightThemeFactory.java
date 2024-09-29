package org.example.abstractSdp.textField;

import org.example.abstractSdp.Button;
import org.example.abstractSdp.Text;
import org.example.abstractSdp.UIFactory;
import org.example.abstractSdp.button.LightButton;
import org.example.abstractSdp.textField.LightTextField;

public class LightThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Text createText() {
        return new LightTextField();
    }
}
