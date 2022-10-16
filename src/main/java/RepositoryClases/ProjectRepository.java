package RepositoryClases;

import PrimaryClases.Project;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ProjectRepository {
    private String projectTitle;
    private Date projectDate;

    private List<Project> projects = new ArrayList<>();

    public Project createNewProject(String projectTitle) {
        int id = 0;
        projectDate = new Date();
        ListIterator<Project> iId = projects.listIterator();
        if (projects.isEmpty()) {
            id = 0;
        } else if (iId.hasNext()) {
            id = projects.size();
        }
        Project newOne = new Project(id,projectTitle,projectDate);
        this.projects.add(newOne);
        System.out.println("Do listy na pozycji: " +id+ " został dodany projekt: " + newOne.getTitle());
        return newOne;
    }

    public void saveALL(){
        try {
            FileWriter fw = new FileWriter("./projectList.txt");
            for (int i = 0; i < projects.size();i++) {
                projects.get(i).setId(i+1);
                fw.write(String.valueOf(projects.get(i).getId()));
                fw.write(" : ");
                fw.write(projects.get(i).getProjectTitle());
                fw.write(" Utworzono: ");
                fw.write(String.valueOf(projectDate));
                fw.write("\n");

            }
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("Plik już istnieje bądż nie można go strworzyć ");
        }
    }

    public void readALL() throws IOException {

        FileReader fr = new FileReader("./projectList.txt");
        if (!projects.isEmpty()) {
            List<String> projectList = Files.readAllLines(Paths.get("./projectList.txt"));
            projectList.forEach(System.out::println);
        }


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