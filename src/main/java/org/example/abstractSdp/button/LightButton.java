package org.example.abstractSdp.button;

import org.example.abstractSdp.Button;

public class LightButton implements Button {
    @Override
    public void change() {
        System.out.println("Changing to light");
    }
}
