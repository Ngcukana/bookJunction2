package za.ac.cput.repository;


import za.ac.cput.domain.Seller;

import java.util.ArrayList;
import java.util.List;

    public class SellerRepository {
        private List<Seller> sellers;

        public SellerRepository() {
            this.sellers = new ArrayList<>();
        }

        public void addSeller(Seller seller) {
            sellers.add(seller);
        }

        public void removeSeller(Seller seller) {
            sellers.remove(seller);
        }

        public List<Seller> getAllSellers() {
            return new ArrayList<>(sellers);
        }

        public Seller findSellerById(String email) {
            for (Seller seller : sellers) {
                if (seller.getEmail() == email) {
                    return seller;
                }
            }
            return null;
        }
    }


