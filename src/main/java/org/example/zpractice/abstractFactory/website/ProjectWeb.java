package org.example.zpractice.abstractFactory.website;

import org.example.zpractice.abstractFactory.factory.Project;

public class ProjectWeb implements Project {
    @Override
    public void manageProject() {
        System.out.println("ProjectWeb testing");
    }
}
