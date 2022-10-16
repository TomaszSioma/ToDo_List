package RepositoryClases;

import PrimaryClases.Project;
import PrimaryClases.Task;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TaskRepository {

    ProjectRepository projectRepository = new ProjectRepository();

    List<Task> tasks = new ArrayList<>();

    public boolean checkProjectTitle(String projectTitle) {
        if (projectRepository.projectsList(projectTitle).contains(projectTitle)) {
            return true;
        } else return false;
    }

    public Task createNewTask(String taskTitle) {
        int id = 0;
        ListIterator<Task> iId = tasks.listIterator();
        if (tasks.isEmpty()) {
            id = 0;
        } else if (iId.hasNext()) {
            id = tasks.size();
        }
        Task newOne = new Task(id, taskTitle);
        this.tasks.add(newOne);
        System.out.println("Do listy na pozycji: " + id + " został dodany projekt: " + newOne.getTaskTitle());
        return newOne;
    }

    public void readALL() throws IOException {

        FileReader fr = new FileReader("./projectList.txt");
        if (!tasks.isEmpty()) {
            List<String> projectList = Files.readAllLines(Paths.get("./projectList.txt"));
            projectList.forEach(System.out::println);
        }
    }

    public void saveALL(){

        try{
            FileWriter fw = new FileWriter("./projectList.txt",true);
                for (int i = 0; i < tasks.size(); i++) {
                    tasks.get(i).setId(i + 1);
                    fw.append(String.valueOf(tasks.get(i).getId()));
                    fw.append(" : ");
                    fw.append(tasks.get(i).getTaskTitle());
                    fw.append(" Utworzono: ");
                    fw.append(String.valueOf(10));
                    fw.append("\n");
                    fw.flush();
                    fw.close();
                }
            } catch (IOException e) {
            System.out.println("Plik już istnieje bądż nie można go strworzyć ");
        }
    }
}

