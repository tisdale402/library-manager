package tisda.alex.librarymanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tisda.alex.librarymanager.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
