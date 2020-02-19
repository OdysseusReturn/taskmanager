import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ProjectServiceImpl implements IProjectServiceImpl{

    @Autowired
    private IProjectRepository projectRepo;

    @Override
    public Optional<Project> findById(long id) {
        return projectRepo.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepo.save(project);
    }
}
