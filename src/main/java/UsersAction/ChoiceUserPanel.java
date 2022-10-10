package UsersAction;

import AlgorithmicClasses.ChoiceMenu;
import ServiceClases.ProjectService;

import java.util.Scanner;

public class ChoiceUserPanel {


    Scanner scanner = new Scanner(System.in);
    ProjectService newProjectAdd = new ProjectService();

    public void ChoiceLogic() {

        System.out.println("To jest podstawowa lista ToDo \n");
        System.out.println("Wybierz co chcesz zrobić: \n");
        System.out.println("1. Projekt - tworzenie / zapisanie");
        System.out.println("2. Wyświetl projekty");
        System.out.println("3. Stwórz nowe zadanie");
        System.out.println("4. Edytuj już stworzone zadanie");
        System.out.println("4. Wyświetl aktywne zadania");
        System.out.println("6. Przenieś zadania do Archiwum");
        System.out.println("7. Wyświetl zadaia z archiwum");
        System.out.println("8. Usuń zadanie z listy");
        System.out.println("0. Wyjdź z programu");


        int choice = -1;


        while (choice != 0) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice > 0 && choice < 9 && choice != 0) {
                    switch (choice) {
                        case 1:
                            System.out.println("1. Stwórz nowy projekt");
                            System.out.println("2. Zapisz do pliku");
                            System.out.println("0. Powrót");
                            choiseOne();
                            break;
                        case 2:
                            System.out.println("1. Wczytaj liste wszystkich projektów");
                            System.out.println("2. Wczytaj konkretny projekt");
                            System.out.println("0. Powrót");
                            choiceTwo();
                            break;
                        case 3:
                            System.out.println("1. Stwórz nowy Task");
                            System.out.println("2. Zapisz do pliku");
                            System.out.println("0. Powrót");
                            ChoiceMenu choicethree = new ChoiceMenu();
                            choicethree.newTask(choice);
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
                        case 8:
                            System.out.println("7. Działa");
                            break;
                    }
                } else if (choice < 0 || choice > 8) {
                    System.out.println("Liczba po za zakresem, podaj proszę lizbę z przedziału od 0 do 8");
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

    public String createNewString(Scanner scanner) {
        String projectTitle = scanner.nextLine();
        return projectTitle;
    }

    public void choiseOne() {
        int choiceOne = -1;

        while (choiceOne != 0) {
            choiceOne = Integer.parseInt(scanner.nextLine());
            try {
                if (choiceOne > 0 && choiceOne < 3 && choiceOne != 0) {
                    switch (choiceOne) {
                        case 1:
                            System.out.println("Podaj nazwę projektu");
                            this.newProjectAdd.addNewProject(this.createNewString(scanner));
                            break;
                        case 2:
                            this.newProjectAdd.saveAll();
                            System.out.println("Zapisano dane do pliku");
                            break;
                    }
                } else if (choiceOne < 0 || choiceOne > 2) {
                    System.out.println("Liczba po za zakresem, podaj proszę lizbę z przedziału od 0 do 8");
                } else if (choiceOne == 0) {
                    System.out.println("Podaj liczbę od 0 do 8");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Wpisany ciąg nie jest liczbą, proszę spróbować jescze raz");
            }
        }
    }

            public void choiceTwo () {
                int choiceTwo = -1;

                while (choiceTwo != 0) {
                    choiceTwo = Integer.parseInt(scanner.nextLine());
                    try {
                        if (choiceTwo > 0 && choiceTwo < 3 && choiceTwo != 0) {
                            switch (choiceTwo) {
                                case 1:
                                    this.newProjectAdd.readALL();
                                    break;
                                case 2:
                                    this.newProjectAdd.saveAll();
                                    System.out.println("Zapisano dane do pliku");
                                    break;
                            }
                        } else if (choiceTwo < 0 || choiceTwo > 2) {
                            System.out.println("Liczba po za zakresem, podaj proszę lizbę z przedziału od 0 do 8");
                        } else if (choiceTwo == 0) {
                            System.out.println("Podaj liczbę od 0 do 8");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Wpisany ciąg nie jest liczbą, proszę spróbować jescze raz");
                    }
                }
            }
        }


