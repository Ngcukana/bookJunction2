package za.ac.cput.service;


import za.ac.cput.domain.Book;
import za.ac.cput.domain.Buyer;

import java.util.List;

public interface IBuyerService extends IService{
    List<Buyer> getall();
}
