package za.ac.cput.factory;

import za.ac.cput.domain.Category;
import za.ac.cput.util.Helper;

public class CategoryFactory {
    public static Category Builder(long categoryID, String name, String description) {
        if (Helper.isNullOrEmpty(String.valueOf(categoryID)) ||
                Helper.isNullOrEmpty(name) ||
                Helper.isNullOrEmpty(description)) {
            return null;
        }
        return new Category.Builder()
                .setCategoryID(categoryID)
                .setName(name)
                .setDescription(description)
                .build();

    }
}
