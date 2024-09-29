package org.example.zpractice.factory;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createObject() {
        return new JavaDeveloper();
    }
}
