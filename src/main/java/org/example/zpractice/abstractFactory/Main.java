package org.example.zpractice.abstractFactory;


import org.example.zpractice.abstractFactory.factory.Developer;
import org.example.zpractice.abstractFactory.factory.Project;
import org.example.zpractice.abstractFactory.factory.ProjectTeamFactory;
import org.example.zpractice.abstractFactory.factory.Tester;
import org.example.zpractice.abstractFactory.website.WebTeamFactory;

public class Main {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory=new WebTeamFactory();
        Developer developer=projectTeamFactory.createDev();
        Project project= projectTeamFactory.createProject();
        Tester tester= projectTeamFactory.createTest();


        developer.writecode();
        project.manageProject();
        tester.test();

    }
}
