package PrimaryClases;

import java.util.Scanner;

public class Project {

    private int id;
    private String projectTitle;

    public Project(int id, String projectTitle) {
        this.id = id;
        this.projectTitle = projectTitle;
    }

    public String getTitle() {
        return projectTitle;
    }
}
