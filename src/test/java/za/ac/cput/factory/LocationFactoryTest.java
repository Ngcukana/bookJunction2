package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Location;
import za.ac.cput.factory.LocationFactory;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LocationFactoryTest {
    @Test
    void testBuildLocation() {

        Location location = LocationFactory.createLocation("10 dorset street", "0793322113", "9:00 to 18:00", "Capetown");

        assertNotNull(location);
        System.out.println(location.toString());


    }
}
