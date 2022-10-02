package RepositoryClases;

import PrimaryClases.Project;
import PrimaryClases.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TaskRepository {

    ProjectRepository projectRepository = new ProjectRepository();

    List<Task> tasks = new ArrayList<>();

    public boolean checkProjectTitle(String projectTitle) {
        if (projectRepository.projectsList(projectTitle).contains(projectTitle)) {
            return true ;
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
        Task newOne = new Task(id,taskTitle);
        this.tasks.add(newOne);
        System.out.println("Do listy na pozycji: " +id+ " został dodany projekt: " + newOne);
        return newOne;
        }
    }

