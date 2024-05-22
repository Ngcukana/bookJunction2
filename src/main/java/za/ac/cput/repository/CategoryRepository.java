package za.ac.cput.repository;

import za.ac.cput.domain.Category;

import java.util.List;

public interface CategoryRepository extends IRepository<Category, Long>{
    List<Category> getAll();
}
