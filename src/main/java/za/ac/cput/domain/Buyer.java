package za.ac.cput.domain;



@Entity
public class Buyer {
        public void setEmail(String email) {
                this.email = email;
        }

        private String email;
        private String name;
        private String phoneNumber;

        public Buyer() {
                this.email = email;
                this.name = name;
                this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
                return email;
        }

        public String getName() {
                return name;
        }

        public String getPhoneNumber() {
                return phoneNumber;
        }

        public void setName(String luckyUpdated) {
        }


        public static class Builder {
                private String email;
                private String name;
                private String phoneNumber;

                public Builder setEmail(String email) {
                        this.email = email;
                        return this;
                }

                public Builder setName(String name) {
                        this.name = name;
                        return this;
                }

                public Builder setPhoneNumber(String phoneNumber) {
                        this.phoneNumber = phoneNumber;
                        return this;
                }

                public Builder copy(Buyer buyer) {
                        this.email = buyer.email;
                        this.name = buyer.name;
                        this.phoneNumber = buyer.phoneNumber;
                        return this;
                }

                public Buyer build() {
                        Buyer buyer = new Buyer();
                        buyer.email = this.email;
                        buyer.name = this.name;
                        buyer.phoneNumber = this.phoneNumber;
                        return buyer;
                }

                public Seller.Builder setname(String name) {

                        return null;
                }

        }
}
