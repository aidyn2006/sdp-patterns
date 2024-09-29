package org.example.abstractSdp.button;

import org.example.abstractSdp.Button;

public class DarkButton implements Button {
    @Override
    public void change() {
        System.out.println("Changing to dark");
    }
}
