package za.ac.cput.repository;

import za.ac.cput.domain.Buyer;
import za.ac.cput.domain.Cart;
import za.ac.cput.domain.Seller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BuyerRepository implements IBuyerRepository{

    private static BuyerRepository repository = null;
    private List<Buyer> BuyerList;
    private BuyerRepository() {
        BuyerList = new ArrayList<>();
    }

    public static IBuyerRepository getRepository() {
        if (repository == null) {
            repository = new BuyerRepository();
        }
        return repository;
    }

    @Override
    public List<Buyer> getAll() {
        return BuyerList;
    }

    @Override
    public Buyer create(Buyer object) {
        if (BuyerList.add(object)) {
            return object;
        }
        return null;
    }

    @Override
    public Buyer read(String s) {
        for (Buyer buyer : BuyerList) {
            if (Objects.equals(buyer.getEmail(), buyer)) {

            }
            return buyer;
        }
        return null;
    }

    @Override
    public Buyer update(Buyer object) {
        Buyer existingBuyer = read(object.getEmail());
        if (existingBuyer != null) {
            BuyerList.remove(existingBuyer);
            BuyerList.add(object);
            return object;
        }
        return null;
    }
}
