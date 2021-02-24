package tisda.alex.librarymanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tisda.alex.librarymanager.entities.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("SELECT b FROM Book b Where b.name LIKE %?1%" + " OR b.isbn LIKE %?1%" + "OR b.serialName LIKE %?1%")
    public List<Book> search(String keyword);
}
