package za.ac.cput.domain;


import java.util.Objects;

public class Author {
    private String authorID;
    private String firstName;
    private String lastName;
    private String dateofbirth;
    private String emailAddress;
    private String phoneNumber;
    private String nationality;

    private Author() {

    }

    private Author(Builder builder) {
        this.authorID = builder.authorID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.dateofbirth = builder.dateofbirth;
        this.emailAddress = builder.emailAddress;
        this.phoneNumber = builder.phoneNumber;
        this.nationality = builder.nationality;

    }

    public String getAuthorID() {
        return authorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author author)) return false;
        return Objects.equals(getAuthorID(), author.getAuthorID()) && Objects.equals(getFirstName(), author.getFirstName()) && Objects.equals(getLastName(), author.getLastName()) && Objects.equals(getDateofbirth(), author.getDateofbirth()) && Objects.equals(getEmailAddress(), author.getEmailAddress()) && Objects.equals(getPhoneNumber(), author.getPhoneNumber()) && Objects.equals(getNationality(), author.getNationality());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthorID(), getFirstName(), getLastName(), getDateofbirth(), getEmailAddress(), getPhoneNumber(), getNationality());
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorID='" + authorID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateofbirth='" + dateofbirth + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public static class Builder {
        private String authorID;
        private String firstName;
        private String lastName;
        private String dateofbirth;
        private String emailAddress;
        private String phoneNumber;
        private String nationality;

        public Builder setAuthorID(String authorID) {
            this.authorID = authorID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setDateofbirth(String dateofbirth) {
            this.dateofbirth = dateofbirth;
            return this;
        }

        public Builder setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Builder copy(Author a) {
            this.authorID = a.authorID;
            this.firstName = a.firstName;
            this.lastName = a.lastName;
            this.dateofbirth = a.dateofbirth;
            this.emailAddress = a.emailAddress;
            this.phoneNumber = a.phoneNumber;
            this.nationality = a.nationality;
            return this;
        }

            public Author build(){
                return new Author(this);}
        }
    }


