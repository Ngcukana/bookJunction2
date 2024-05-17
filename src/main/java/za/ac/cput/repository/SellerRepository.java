package za.ac.cput.repository;

import za.ac.cput.domain.Seller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SellerRepository implements ISellerRepository{

    private static SellerRepository repository = null;
    private List<Seller> SellerList;
    private SellerRepository() {
        SellerList = new ArrayList<>();
    }

    public static ISellerRepository getRepository() {
        if (repository == null) {
            repository = new SellerRepository();
        }
        return repository;
    }

    @Override
    public List<Seller> getAll() {
        return SellerList;
    }

    @Override
    public Seller create(Seller object) {
        if (SellerList.add(object)) {
            return object;
        }
        return null;
    }

    @Override
    public Seller read(String s) {
        for (Seller seller : SellerList) {
            if (Objects.equals(seller.getEmail(), seller)) {

            }
            return seller;
        }
        return null;
    }

    @Override
    public Seller update(Seller object) {
        Seller existingSeller = read(object.getEmail());
        if (existingSeller != null) {
            SellerList.remove(existingSeller);
            SellerList.add(object);
            return object;
        }
        return null;
    }
}
