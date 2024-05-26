package za.ac.cput.factory;

import za.ac.cput.domain.Buyer;

public class BuyerFactory {

    public static Buyer createBuyer(String name, String email, String phoneNumber) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name is required");
        }
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email is required");
        }
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("Phone number is required");
        }
        return new Buyer.Builder()
                .setName(name)
                .setEmail(email)
                .setPhoneNumber(phoneNumber)
                .build();
    }
}
