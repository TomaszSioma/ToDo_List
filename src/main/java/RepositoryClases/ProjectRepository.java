package RepositoryClases;

import PrimaryClases.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ProjectRepository {

    private List<Project> projects = new ArrayList<>();

    public Project createNewProject(String projectTitle) {
        int id = 0;
        ListIterator<Project> iId = projects.listIterator();
        if (projects.isEmpty()) {
            id = 0;
        } else if (iId.hasNext()) {
            id = projects.size();
        }

        Project newOne = new Project(id,projectTitle);
        this.projects.add(newOne);
        System.out.println("Do listy na pozycji: " +id+ " został dodany projekt: " + projectTitle);
        return newOne;
    }
}
