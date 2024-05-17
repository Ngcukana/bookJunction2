package za.ac.cput.domain;

import java.util.Objects;

public class Book {
    private long bookID;
    private String ISBN;
    private String title;
    private String edition;
    private Double price;
    private String datePosted;

    private Book(){}

    protected Book(Builder builder){
        this.bookID=builder.bookID;
        this.ISBN= builder.ISBN;
        this.title= builder.title;
        this.edition= builder.edition;
        this.price= builder.price;
        this.datePosted= builder.datePosted;

    }

    public long getBookID() {
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

    public Double getPrice() {
        return price;
    }

    public String getDatePosted() {
        return datePosted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return getBookID() == book.getBookID() && Objects.equals(getISBN(), book.getISBN()) && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getEdition(), book.getEdition()) && Objects.equals(getPrice(), book.getPrice()) && Objects.equals(getDatePosted(), book.getDatePosted());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookID(), getISBN(), getTitle(), getEdition(), getPrice(), getDatePosted());
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", edition='" + edition + '\'' +
                ", price=" + price +
                ", datePosted='" + datePosted + '\'' +
                '}';
    }

    public static class Builder {
        private long bookID;
        private String ISBN;
        private String title;
        private String edition;
        private Double price;
        private String datePosted;

        public Builder setBookID(long bookID) {
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

        public Builder setPrice(Double price) {
            this.price = price;
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
            this.price= b.price;
            this.datePosted= b.datePosted;
            return this;
        }
        public Book build(){
            return new Book(this);
        }
    }

}
