package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Buyer;
import za.ac.cput.service.BuyerService;

import java.util.List;

@RestController
@RequestMapping("/api/buyers")
public class BuyerController {

    @Autowired
    private BuyerService buyerService;

    @PostMapping
    public ResponseEntity<Buyer> createBuyer(@RequestBody Buyer buyer) {
        Buyer createdBuyer = buyerService.create(buyer);
        return ResponseEntity.ok(createdBuyer);
    }

    @GetMapping("/{email}")
    public ResponseEntity<Buyer> getBuyerByEmail(@PathVariable String email) {
        Buyer buyer = buyerService.read(email);
        if (buyer != null) {
            return ResponseEntity.ok(buyer);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{email}")
    public ResponseEntity<Buyer> updateBuyer(@PathVariable String email, @RequestBody Buyer updatedBuyer) {
        Buyer buyer = buyerService.read(email);
        if (buyer != null) {
            updatedBuyer.setEmail(email);  // Ensure the email is not changed
            Buyer updated = buyerService.update(updatedBuyer);
            return ResponseEntity.ok(updated);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Buyer>> getAllBuyers() {
        List<Buyer> buyers = buyerService.getAll();
        return ResponseEntity.ok(buyers);
    }

    @DeleteMapping("/{email}")
    public ResponseEntity<Void> deleteBuyer(@PathVariable String email) {
        Buyer buyer = buyerService.read(email);
        if (buyer != null) {
            buyerService.delete(email);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}


