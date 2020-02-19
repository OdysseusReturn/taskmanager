import java.util.Optional;

public interface IProjectServiceImpl {
    Optional<Project> findById(long id);

    Project save (Project project);
}
