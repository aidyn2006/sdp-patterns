package org.example.zpractice.abstractFactory.banking;

import org.example.zpractice.abstractFactory.factory.Project;

public class ProjectManager implements Project {
    @Override
    public void manageProject() {
        System.out.println("Manage project");
    }
}
