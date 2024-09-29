package org.example.zpractice.abstractFactory.banking;

import org.example.zpractice.abstractFactory.factory.Developer;
import org.example.zpractice.abstractFactory.factory.Project;
import org.example.zpractice.abstractFactory.factory.ProjectTeamFactory;
import org.example.zpractice.abstractFactory.factory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer createDev() {
        return new JavaDeveloper();
    }

    @Override
    public Project createProject() {
        return new ProjectManager();
    }

    @Override
    public Tester createTest() {
        return new QATester();
    }
}
