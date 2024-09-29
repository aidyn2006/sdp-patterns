package org.example.zpractice.abstractFactory.banking;

import org.example.zpractice.abstractFactory.factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writecode() {
        System.out.println("Java dev wirte code");
    }
}
