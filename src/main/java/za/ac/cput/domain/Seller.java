package za.ac.cput.domain;

import za.ac.cput.domain.Book;

import java.util.List;
import java.util.Objects;

public class Seller {
    private String name;
    private String email;
    private String phoneNumber;
    private List<Book> booksForSale;

    private Seller() {}

    protected Seller(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.booksForSale = builder.booksForSale;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public List<Book> getBooksForSale() {
        return booksForSale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Objects.equals(getName(), seller.getName()) && Objects.equals(getEmail(), seller.getEmail()) && Objects.equals(getPhoneNumber(), seller.getPhoneNumber())  && Objects.equals(getBooksForSale(), seller.getBooksForSale());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEmail(), getPhoneNumber(), getBooksForSale());
    }

    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", booksForSale=" + booksForSale +
                '}';
    }

    public static class Builder {
        private String name;
        private String email;
        private String phoneNumber;
        private List<Book> booksForSale;

        public Builder setname(String name) {
            this.name = name;
            return this;
        }

        public Builder setemail(String email) {
            this.email = email;
            return this;
        }

        public Builder setphoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }


        public Builder setbooksForSale(List<Book> booksForSale) {
            this.booksForSale = booksForSale;
            return this;
        }
        public Seller.Builder copy(Seller seller) {
            this.name = seller.name;
            this.email = seller.email;
            this.phoneNumber = seller.phoneNumber;
            this.booksForSale = seller.booksForSale;
            return this;
        }

        public Seller build() {
            return new Seller(this);
        }


    }
}
