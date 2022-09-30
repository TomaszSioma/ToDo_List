package ServiceClases;

import PrimaryClases.Project;
import RepositoryClases.ProjectRepository;

public class ProjectService {
    ProjectRepository repository = new ProjectRepository();

    public Project addNewProject(String projectTitle) {
        return this.repository.createNewProject(projectTitle);
    }
}
