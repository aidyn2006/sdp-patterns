package org.example.abstractSdp;

import org.example.abstractSdp.button.DarkThemeFactory;
import org.example.abstractSdp.textField.LightThemeFactory;

public class Main {
    public static void main(String[] args) {
        //DARKTHEME
        UIFactory ui=new DarkThemeFactory();
        Button button=ui.createButton();
        Text text=ui.createText();

        button.change();
        text.change();


        //LIGHT THEME
        UIFactory uiLight=new LightThemeFactory();
        Button button1= uiLight.createButton();
        Text text1= uiLight.createText();

        button1.change();
        text1.change();
    }
}
