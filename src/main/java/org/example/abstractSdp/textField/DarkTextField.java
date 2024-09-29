package org.example.abstractSdp.textField;

import org.example.abstractSdp.Text;

public class DarkTextField implements Text {
    @Override
    public void change() {
        System.out.println("Changing to dark text field");
    }
}
