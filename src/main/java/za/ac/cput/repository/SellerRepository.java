package za.ac.cput.repository;

import za.ac.cput.domain.Seller;

import java.util.ArrayList;
import java.util.List;

public class SellerRepository implements ISellerRepository {
    private List<Seller> sellers;

    public SellerRepository() {
        this.sellers = new ArrayList<>();
    }

    @Override
    public void addSeller(Seller seller) {
        sellers.add(seller);
    }

    @Override
    public void removeSeller(Seller seller) {
        sellers.remove(seller);
    }

    @Override
    public List<Seller> getAllSellers() {
        return new ArrayList<>(sellers);
    }

    @Override
    public Seller findSellerByEmail(String email) {
        return null;
    }

    @Override
    public Seller findSellerById(String Email) {
        for (Seller seller : sellers) {
            if (seller.getEmail() == Email) {
                return seller;
            }
        }
        return null;
    }
}
