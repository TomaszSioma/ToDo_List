package UsersAction;

import ServiceClases.ProjectService;

import java.util.Scanner;

public class ChoiceUserPanel {

    ProjectService newProjectAdd = new ProjectService();

    public void ChoiceLogic(){

        System.out.println("To jest podstawowa lista ToDo \n");
        System.out.println("Wybierz co chcesz zrobić: \n");
        System.out.println("1. Stwórz nowy projekt");
        System.out.println("2. Stwórz nowe zadanie");
        System.out.println("3. Edytuj już stworzone zadanie");
        System.out.println("4. Wyświetl aktywne zadania");
        System.out.println("5. Przenieś zadania do Archiwum");
        System.out.println("6. Wyświetl zadaia z archiwum");
        System.out.println("7. Usuń zadanie z listy");
        System.out.println("0. Wyjdź z programu");


        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice > 0 && choice < 8 && choice != 0) {
                    switch (choice) {
                        case 1:
                            System.out.println("Podaj nazwę projektu");
                            String projectTitle = scanner.nextLine();
                            this.newProjectAdd.addNewProject(projectTitle);
                            break;
                        case 2:
                            System.out.println("2. Działa");
                            break;
                        case 3:
                            System.out.println("3. Działa");
                            break;
                        case 4:
                            System.out.println("4. Działa");
                            break;
                        case 5:
                            System.out.println("5. Działa");
                            break;
                        case 6:
                            System.out.println("6. Działa");
                            break;
                        case 7:
                            System.out.println("7. Działa");
                            break;
                    }
                } else if (choice < 0 || choice > 7) {
                    System.out.println("Liczba po za zakresem, podaj proszę lizbę z przedziału od 0 do 6");
                }

            } catch (NumberFormatException e) {
                System.out.println("Wpisany ciąg nie jest liczbą, proszę spróbować jescze raz");
            }
            if (choice == 0) {
                System.out.println("Koniec programu");
                break;
            }
        }
    }
}

