package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Buyer;
import za.ac.cput.domain.Seller;

import java.util.List;

import za.ac.cput.repository.SellerRepository;

/**
 *
 */
@Service
public class SellerService implements ISellerService{

    private static ISellerService service=null;
    private SellerRepository repository;

    @Autowired
    private SellerService(){

    }

    public static ISellerService getService() {
        if (service == null){
            service = new SellerService();
        }
        return service;
    }

    @Override
    public Seller create(Seller seller) {
        return repository.save(seller);
    }

    @Override
    public Seller read(String Email) {
        return repository.findByEmail(Email);
    }

    @Override
    public Seller update(Seller seller) {
        return repository.save(seller);
    }

    @Override
    public Buyer update(Buyer buyer) {
        return null;
    }

    @Override
    public List<Seller> getall() {
        return repository.findAll();
    }

    @Override
    public Seller delete(String s) {
        return null;
    }

}







