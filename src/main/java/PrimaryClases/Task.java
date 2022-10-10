package PrimaryClases;

import java.util.Date;

public class Task {
    private String taskTitle;
    private int id;
    private Date taskDate;

    public Task(int id, String taskTitle) {
        this.id = id;
        this.taskTitle = taskTitle;
    }

    public Task(String taskTitle, int id, Date taskDate) {
        this.taskTitle = taskTitle;
        this.id = id;
        this.taskDate = taskDate;
    }

    public Task(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
