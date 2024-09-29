package org.example.zpractice.singelton;

public class Main {
    public static void main(String[] args) {
    Singelton singelton=Singelton.createobject();
    singelton.doSomthing();

    Singelton singelton1=Singelton.createobject();
    singelton1.doSomthing();
    }
}
