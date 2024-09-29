package org.example.zpractice.abstractFactory.website;

import org.example.zpractice.abstractFactory.factory.Tester;

public class WebTester implements Tester {
    @Override
    public void test() {
        System.out.println("WebTester testing");
    }
}
