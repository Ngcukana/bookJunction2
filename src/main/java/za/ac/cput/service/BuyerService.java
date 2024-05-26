package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Buyer;
import za.ac.cput.repository.BuyerRepository;

import java.util.List;

@Service
public class BuyerService {
    @Autowired
    private BuyerRepository buyerRepository;

    public Buyer create(Buyer buyer) {
        return buyerRepository.save(buyer);
    }

    public Buyer read(String email) {
        return buyerRepository.findById(email).orElse(null);
    }

    public Buyer update(Buyer buyer) {
        if (buyerRepository.existsById(buyer.getEmail())) {
            return buyerRepository.save(buyer);
        }
        return null;
    }

    public List<Buyer> getAll() {
        return buyerRepository.findAll();
    }

    public void delete(String email) {
        buyerRepository.deleteById(email);
    }
}
