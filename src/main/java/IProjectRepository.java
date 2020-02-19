import java.util.Optional;

public interface IProjectRepository {

    Optional<Project> findById(long id);

    Project save (Project project);

}
