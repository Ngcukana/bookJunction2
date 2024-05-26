package za.ac.cput.controller;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.Buyer;
import za.ac.cput.factory.BuyerFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BuyerControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private String getRootUrl() {
        return "http://localhost:" + port + "/api/buyers";
    }

    @Test
    void testCreateBuyer() {
        Buyer buyer = BuyerFactory.createBuyer("Lucky", "lucky@example.com", "0633917535");
        ResponseEntity<Buyer> postResponse = restTemplate.postForEntity(getRootUrl(), buyer, Buyer.class);
        assertNotNull(postResponse);
        assertEquals(HttpStatus.OK.value(), postResponse.getStatusCodeValue());  // Use HttpStatus.OK.value()
        assertNotNull(postResponse.getBody());
    }

    @Test
    void testGetBuyerByEmail() {
        Buyer buyer = restTemplate.getForObject(getRootUrl() + "/lucky@example.com", Buyer.class);
        assertNotNull(buyer);
    }

    @Test
    void testUpdateBuyer() {
        String email = "lucky@example.com";
        Buyer buyer = restTemplate.getForObject(getRootUrl() + "/" + email, Buyer.class);
        buyer.setName("Lucky Updated");

        restTemplate.put(getRootUrl() + "/" + email, buyer);

        Buyer updatedBuyer = restTemplate.getForObject(getRootUrl() + "/" + email, Buyer.class);
        assertNotNull(updatedBuyer);
        assertEquals("Lucky Updated", updatedBuyer.getName());
    }

    @Test
    void testDeleteBuyer() {
        String email = "lucky@example.com";
        Buyer buyer = restTemplate.getForObject(getRootUrl() + "/" + email, Buyer.class);
        assertNotNull(buyer);

        restTemplate.delete(getRootUrl() + "/" + email);

        Buyer deletedBuyer = restTemplate.getForObject(getRootUrl() + "/" + email, Buyer.class);
        assertNull(deletedBuyer);
    }
}

