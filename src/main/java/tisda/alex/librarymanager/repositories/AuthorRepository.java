package tisda.alex.librarymanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tisda.alex.librarymanager.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
