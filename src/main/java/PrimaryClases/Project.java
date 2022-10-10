package PrimaryClases;

import java.util.Date;
import java.util.Scanner;

public class Project {

    private int id;
    private String projectTitle;
    private Date projectDate;

    public Project(int id, String projectTitle) {
        this.id = id;
        this.projectTitle = projectTitle;
    }

    public Project(int id, String projectTitle, Date projectDate) {
        this.id = id;
        this.projectTitle = projectTitle;
        this.projectDate = projectDate;
    }

    public String getTitle() {
        return projectTitle;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getProjectTitle() {
        return projectTitle;
    }


}
