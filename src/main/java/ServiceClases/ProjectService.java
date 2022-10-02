package ServiceClases;

import PrimaryClases.Project;
import RepositoryClases.ProjectRepository;

import java.io.IOException;

public class ProjectService {
    ProjectRepository repository = new ProjectRepository();

    public Project addNewProject(String projectTitle) {
        return this.repository.createNewProject(projectTitle);
    }

  public void  readALL() {
      try {
          this.repository.readALL();
      } catch (IOException e) {
          System.out.println("Brak pliku");
      } catch (NullPointerException e) {
          System.out.println("Plik jest pusty");
      }
  }

  public void readOne() {
        try {

        } catch (NullPointerException e) {
            System.out.println("Plik jest pusty");
        }
  }

    public void saveAll(){
        this.repository.saveALL();
    }
}
