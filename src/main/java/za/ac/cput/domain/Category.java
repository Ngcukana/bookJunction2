package za.ac.cput.domain;

import java.util.Objects;

public class Category {
    private long categoryID;
    private String name;
    private String description;
    private Category(){

    }

    protected Category(Builder br){
        this.categoryID=br.categoryID;
        this.name=br.name;
        this.description=br.description;
    }

    public long getCategoryID() {
        return categoryID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category category)) return false;
        return getCategoryID() == category.getCategoryID() && Objects.equals(getName(), category.getName()) && Objects.equals(getDescription(), category.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCategoryID(), getName(), getDescription());
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryID=" + categoryID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    public static class Builder {
        private long categoryID;
        private String name;
        private String description;

        public Builder setCategoryID(long categoryID) {
            this.categoryID = categoryID;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Category.Builder copy(Category c) {
            this.categoryID=c.categoryID;
            this.name=c.name;
            this.description=c.description;
            return this;
        }
        public Category build(){
            return new Category(this);
        }
    }
}
