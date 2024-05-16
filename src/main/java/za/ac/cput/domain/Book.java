package za.ac.cput.domain;

import java.util.Objects;

public class Book {
    private int bookID;
    private String ISBN;
    private String title;
    private String edition;
    private String category;
    private Double price;
    private String userID;
    private String datePosted;

    private Book(){}

    protected Book(Builder builder){
        this.bookID=builder.bookID;
        this.ISBN= builder.ISBN;
        this.title= builder.title;
        this.edition= builder.edition;
        this.category= builder.category;
        this.price= builder.price;
        this.userID= builder.userID;
        this.datePosted= builder.datePosted;

    }

    public int getBookID() {
        return bookID;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getEdition() {
        return edition;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }

    public String getUserID() {
        return userID;
    }

    public String getDatePosted() {
        return datePosted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return getBookID() == book.getBookID() && Objects.equals(getISBN(), book.getISBN()) && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getEdition(), book.getEdition()) && Objects.equals(getCategory(), book.getCategory()) && Objects.equals(getPrice(), book.getPrice()) && Objects.equals(getUserID(), book.getUserID()) && Objects.equals(getDatePosted(), book.getDatePosted());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookID(), getISBN(), getTitle(), getEdition(), getCategory(), getPrice(), getUserID(), getDatePosted());
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", edition='" + edition + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", userID='" + userID + '\'' +
                ", datePosted='" + datePosted + '\'' +
                '}';
    }

    public static class Builder {
        private int bookID;
        private String ISBN;
        private String title;
        private String edition;
        private String category;
        private Double price;
        private String userID;
        private String datePosted;

        public Builder setBookID(int bookID) {
            this.bookID = bookID;
            return this;
        }

        public Builder setISBN(String ISBN) {
            this.ISBN = ISBN;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setEdition(String edition) {
            this.edition = edition;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setPrice(Double price) {
            this.price = price;
            return this;
        }

        public Builder setUserID(String userID) {
            this.userID = userID;
            return this;
        }

        public Builder setDatePosted(String datePosted) {
            this.datePosted = datePosted;
            return this;
        }
        public Builder copy(Book b) {
            this.bookID=b.bookID;
            this.ISBN= b.ISBN;
            this.title= b.title;
            this.edition= b.edition;
            this.category= b.category;
            this.price= b.price;
            this.userID= b.userID;
            this.datePosted= b.datePosted;
            return this;
        }
        public Book build(){
            return new Book(this);
        }
    }

}
