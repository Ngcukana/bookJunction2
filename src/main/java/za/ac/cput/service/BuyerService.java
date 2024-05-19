package za.ac.cput.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.ac.cput.domain.Buyer;
import za.ac.cput.repository.BuyerRepository;

import java.util.List;

/**
 *
 */
@Service
public class BuyerService implements IBuyerService {

    private static IBuyerService service = null;
    private BuyerRepository repository;

    @Autowired
    private BuyerService() {

        this.repository = repository;
    }

    public static IBuyerService getService() {
        if (service == null) {
            service = new BuyerService();
        }
        return service;
    }


    @Override
    public Object create(Object obj) {
        return null;
    }

    @Override
    public Object read(Object o) {
        return null;
    }

    @Override
    public Object update(Object obj) {
        return null;
    }

    @Override
    public List<Buyer> getall() {
        return List.of();
    }
}







