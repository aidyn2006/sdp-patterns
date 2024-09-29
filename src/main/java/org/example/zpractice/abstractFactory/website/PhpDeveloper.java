package org.example.zpractice.abstractFactory.website;

import org.example.zpractice.abstractFactory.factory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writecode() {
        System.out.println("Php developer writes code");
    }
}
