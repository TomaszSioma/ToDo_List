package RepositoryClases;

import PrimaryClases.Project;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ProjectRepository {
    private String projectTitle;

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
        System.out.println("Do listy na pozycji: " +id+ " został dodany projekt: " + newOne.getTitle());
        return newOne;
    }

    public void saveALL(){
        Gson gson = new Gson();
        try {
            FileWriter fw = new FileWriter("./projectList.json");
            gson.toJson(this.projects,fw);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("Plik już istnieje bądż nie można go strworzyć ");
        }
    }

    public void readALL() throws FileNotFoundException {
        Gson gson = new Gson();

            FileReader fr = new FileReader("./projectList.json");
            List<Project> loadedProject = gson.fromJson(fr,new TypeToken<List<Project>>() {}.getType());
            this.projects.addAll(loadedProject);
            this.projects.forEach(project -> {
                System.out.println("Załadowano projekty: " + project.getTitle());
            });
    }
    public void readOne(String projectTitle) throws FileNotFoundException {

        Gson gson = new Gson();
        FileReader fr = new FileReader("./projectList.json");
        System.out.println(projectTitle);
    }

    public List<Project> projectsList (String projectTitle) {
        return projects;
    }
}