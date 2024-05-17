package za.ac.cput.domain;

import za.ac.cput.domain.Book;

import java.util.List;
import java.util.Objects;

public class Buyer {
        private String name;
        private String email;
        private String phoneNumber;
        private List<Book> interestedBooks;

        private Buyer() {}

        protected Buyer(Builder builder) {
                this.name = builder.name;
                this.email = builder.email;
                this.phoneNumber = builder.phoneNumber;
                this.interestedBooks = builder.interestedBooks;
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



        public List<Book> getInterestedBooks() {
                return interestedBooks;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Buyer buyer = (Buyer) o;
                return Objects.equals(getName(), buyer.getName()) && Objects.equals(getEmail(), buyer.getEmail()) && Objects.equals(getPhoneNumber(), buyer.getPhoneNumber())  && Objects.equals(getInterestedBooks(), buyer.getInterestedBooks());
        }

        @Override
        public int hashCode() {
                return Objects.hash(getName(), getEmail(), getPhoneNumber(),getInterestedBooks());
        }

        @Override
        public String toString() {
                return "Buyer{" +
                        "name='" + name + '\'' +
                        ", email='" + email + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        ", interestedBooks=" + interestedBooks +
                        '}';
        }

        public static class Builder  {
                private String name;
                private String email;
                private String phoneNumber;
                private List<Book> interestedBooks;

                public Builder name(String name) {
                        this.name = name;
                        return this;
                }

                public Builder email(String email) {
                        this.email = email;
                        return this;
                }

                public Builder phoneNumber(String phoneNumber) {
                        this.phoneNumber = phoneNumber;
                        return this;
                }



                public Builder interestedBooks(List<Book> interestedBooks) {
                        this.interestedBooks = interestedBooks;
                        return this;
                }
                public Buyer.Builder copy(Buyer buyer) {
                        this.name = buyer.name;
                        this.email = buyer.email;
                        this.phoneNumber = buyer.phoneNumber;
                        this.interestedBooks = buyer.interestedBooks;
                        return this;
                }

                public Buyer build() {
                        return new Buyer(this);
                }
        }
}
