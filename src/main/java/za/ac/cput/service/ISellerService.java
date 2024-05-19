package za.ac.cput.service;

import za.ac.cput.domain.Buyer;
import za.ac.cput.domain.Seller;

import java.util.List;

public interface ISellerService extends IService<Seller,String> {
    Buyer update(Buyer buyer);

    List<Seller> getall();

    Seller delete(String s);
}
