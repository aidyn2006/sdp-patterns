package org.example.abstractSdp.textField;

import org.example.abstractSdp.Text;

public class LightTextField implements Text {
    @Override
    public void change() {
        System.out.println("Changing to light text field");
    }
}
