package org.example.zpractice.abstractFactory.website;

import org.example.zpractice.abstractFactory.factory.Developer;
import org.example.zpractice.abstractFactory.factory.Project;
import org.example.zpractice.abstractFactory.factory.ProjectTeamFactory;
import org.example.zpractice.abstractFactory.factory.Tester;

public class WebTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer createDev() {
        return new PhpDeveloper();
    }

    @Override
    public Project createProject() {
        return new ProjectWeb();
    }

    @Override
    public Tester createTest() {
        return new WebTester();
    }
}
