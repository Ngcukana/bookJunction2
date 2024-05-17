package za.ac.cput.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Book;
import za.ac.cput.domain.Category;

import static org.junit.jupiter.api.Assertions.*;

class CategoryFactoryTest {

    @Test
    void createCategory() {
        long categoryID= 257683;
        String name="Computer Programming";
        String description= "learning java in one day";

        Category category = CategoryFactory.createCategory(categoryID,name,description);

        Assertions.assertNotNull(category);
        System.out.println(category.toString());
    }
}