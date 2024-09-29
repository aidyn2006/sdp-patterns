package org.example.zpractice.abstractFactory.factory;

public interface ProjectTeamFactory {

    Developer createDev();
    Project createProject();
    Tester createTest();

}
