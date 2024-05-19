package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Location;
import za.ac.cput.factory.LocationFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
public class LocationServiceTest {
    private LocationService locationService;
    private static Location location1;
    private static Location location2;

    @Test
    void a_setup(){
        location1 = LocationFactory.createLocation("10 Dorset","0792530160","9:00 t0 17:00","CapeTown");
        assertNotNull(location1);
        System.out.println(location1);
        location2 = LocationFactory.createLocation("143 Sir Lowry Rd","0714079844","9:00 to 18:00","CapeTown2");
        assertNotNull(location2);
        System.out.println(location2);

    }

    @Test
    void b_create() {
        Location created1 = locationService.create(location1);
        assertNotNull(created1);
        System.out.println(created1);
        Location created2 = locationService.create(location2);
        assertNotNull(created2);
        System.out.println(created2);
    }

    @Test
    void c_read() {
        Location read = locationService.read(location1.getAddress());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void d_update() {
        Location newLocation = new Location.Builder().copy(location2).setOperatingHours("8:00 to 15:00").build();
        Location updated = locationService.update(newLocation);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    void e_getall() {
        System.out.println(locationService.getall());
    }

}