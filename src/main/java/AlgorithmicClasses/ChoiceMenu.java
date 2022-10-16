package AlgorithmicClasses;

import ServiceClases.ProjectService;
import ServiceClases.TaskService;

import java.util.Scanner;

public class ChoiceMenu {
    private int choice;
    private TaskService newTaskAdd;

    Scanner scanner = new Scanner(System.in);

    public String createNewString(Scanner scanner) {
        String taskTitle = scanner.nextLine();
        return taskTitle;
    }


    public void newTask(int choice) {

        while (choice != 0) {
            try {
                if (choice > 0 && choice < 3 && choice != 0) {
                    switch (choice) {
                        case 1:
                            this.newTaskAdd.addNewTask(this.createNewString(scanner));
                            break;
                        case 2:
                            this.newTaskAdd.saveAll();
                            System.out.println("Zapisano dane do pliku");
                            break;
                    }
                } else if (choice < 0 || choice > 2) {
                    System.out.println("Liczba po za zakresem, podaj proszę lizbę z przedziału od 0 do 8");
                } else if (choice == 0) {
                    System.out.println("Podaj liczbę od 0 do 8");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Wpisany ciąg nie jest liczbą, proszę spróbować jescze raz");
            }
        }
    }
}