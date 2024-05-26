package za.ac.cput.domain;

public class Buyer {
        private String name;
        private String email;
        private String phoneNumber;

        // Private constructor to enforce the use of the factory
        private Buyer(Builder builder) {
                this.name = builder.name;
                this.email = builder.email;
                this.phoneNumber = builder.phoneNumber;
        }

        // Getters and toString method
        public String getName() {
                return name;
        }

        public String getEmail() {
                return email;
        }

        public String getPhoneNumber() {
                return phoneNumber;
        }

        @Override
        public String toString() {
                return "Buyer{" +
                        "name='" + name + '\'' +
                        ", email='" + email + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        '}';
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
        }

        public static class Builder {
                private String name;
                private String email;
                private String phoneNumber;

                public Builder setName(String name) {
                        this.name = name;
                        return this;
                }

                public Builder setEmail(String email) {
                        this.email = email;
                        return this;
                }

                public Builder setPhoneNumber(String phoneNumber) {
                        this.phoneNumber = phoneNumber;
                        return this;
                }

                public Builder copy(Buyer buyer) {
                        this.name = buyer.name;
                        this.email = buyer.email;
                        this.phoneNumber = buyer.phoneNumber;
                        return this;
                }

                public Buyer build() {
                        return new Buyer(this);
                }
        }
}
