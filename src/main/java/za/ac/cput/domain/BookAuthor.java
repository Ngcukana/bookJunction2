package za.ac.cput.domain;

import java.util.Objects;

public class BookAuthor {
    private String bookAuthorID;
    private String authorID;
    private long bookID;

    private BookAuthor(){}
    private BookAuthor (Builder builder) {
        this.bookAuthorID = builder.bookAuthorID;
        this.authorID = builder.authorID;
        this.bookID = builder.bookID;
    }

    public String getBookAuthorID() {return bookAuthorID;}
    public String getAuthorID() {return authorID;}
    public long getBookID() {return bookID;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookAuthor that)) return false;
        return getBookAuthorID() == that.getBookAuthorID() && getBookID() == that.getBookID() && Objects.equals(getAuthorID(), that.getAuthorID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookAuthorID(), getAuthorID(), getBookID());
    }

    @Override
    public String toString() {
        return "BookAuthor{" +
                "bookAuthorID=" + bookAuthorID +
                ", authorID='" + authorID + '\'' +
                ", bookID=" + bookID +
                '}';
    }
    public static class Builder{
        private String bookAuthorID;
        private String authorID;
        private long bookID;

        public Builder setBookAuthorID(int bookAuthorID) {
            this.bookAuthorID = String.valueOf(bookAuthorID);
            return this;
        }

        public Builder setAuthorID(String authorID) {
            this.authorID = authorID;
            return this;
        }

        public Builder setBookID(long bookID) {
            this.bookID = bookID;
            return this;
        }
        public Builder copy(BookAuthor b){
            this.bookAuthorID = b.bookAuthorID;
            this.bookID = b.bookID;
            this.authorID = b.authorID;
            return this;
        }
        public BookAuthor build(){return new BookAuthor (this);}
    }
}
