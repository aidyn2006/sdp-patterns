package org.example.zpractice.factory;

public class Main {
    public static void main(String[] args) {
       DeveloperFactory developerFactory=new JavaDeveloperFactory();
       Developer developer=developerFactory.createObject();
       developer.writeCode();
    }
}