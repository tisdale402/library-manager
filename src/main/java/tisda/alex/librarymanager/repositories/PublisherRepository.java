package tisda.alex.librarymanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tisda.alex.librarymanager.entities.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
