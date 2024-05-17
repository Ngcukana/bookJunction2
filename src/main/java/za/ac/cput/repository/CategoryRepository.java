package za.ac.cput.repository;

import za.ac.cput.domain.Book;
import za.ac.cput.domain.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryRepository implements ICategoryRepository{
    private static CategoryRepository repository = null;
    private List<Category> CategoryList;
    private CategoryRepository() {
        CategoryList = new ArrayList<>();
    }

    public static ICategoryRepository getRepository() {
        if (repository == null) {
            repository = new CategoryRepository();
        }
        return repository;
    }

    @Override
    public List<Category> getAll() {
        return CategoryList;
    }

    @Override
    public Category create(Category object) {
        if (CategoryList.add(object)) {
            return object;
        }
        return null;

    }

    @Override
    public Category read(Long aLong) {
        return null;
    }

    @Override
    public Category update(Category object) {
        return null;
    }
}
