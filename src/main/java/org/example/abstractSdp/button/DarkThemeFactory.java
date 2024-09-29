package org.example.abstractSdp.button;

import org.example.abstractSdp.Button;
import org.example.abstractSdp.Text;
import org.example.abstractSdp.UIFactory;
import org.example.abstractSdp.button.DarkButton;
import org.example.abstractSdp.textField.DarkTextField;

public class DarkThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Text createText() {
        return new DarkTextField();
    }
}
