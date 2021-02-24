package tisda.alex.librarymanager.services;

import org.springframework.stereotype.Service;
import tisda.alex.librarymanager.entities.Category;

import java.util.List;

@Service
public interface CategoryService {
    public List<Category> findAllCategories();

    public Category findCategoryById(Long id);

    public void createCategory(Category category);

    public void updateCategory(Category category);

    public void deleteCategory(Long id);
}
