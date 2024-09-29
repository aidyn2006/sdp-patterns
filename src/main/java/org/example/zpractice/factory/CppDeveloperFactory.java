package org.example.zpractice.factory;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createObject() {
        return new CppDeveloper();
    }
}
