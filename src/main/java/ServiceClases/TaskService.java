package ServiceClases;

import PrimaryClases.Task;
import RepositoryClases.TaskRepository;

import java.io.IOException;

public class TaskService {

TaskRepository repository = new TaskRepository();

public Task addNewTask(String taskTitle) {return this.repository.createNewTask(taskTitle);}


    public void  readALL() {
        try {
            this.repository.readALL();
        } catch (IOException e) {
            System.out.println("Brak pliku");
        } catch (NullPointerException e) {
            System.out.println("Plik jest pusty");
        }
    }

    public void saveAll() {this.repository.saveALL();}
}
