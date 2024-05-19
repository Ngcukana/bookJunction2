package za.ac.cput.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Appointment;
import za.ac.cput.domain.Location;



import java.time.LocalDateTime;


public class AppointmentFactoryTest {

    @Test
    void createAppointment() {
        String appointmentId = "12345";
        String buyerId = "67890";
        String description = "Textbook pickup";
        LocalDateTime dateTime = LocalDateTime.of(2024, 5, 17, 10, 0);
        Location location = LocationFactory.createLocation("123 Main St", "555-555-5555", "9 AM - 5 PM", "Cape town");

        Appointment appointment = AppointmentFactory.createAppointment(appointmentId, buyerId, description, dateTime, location);

        Assertions.assertNotNull(appointment);
        Assertions.assertEquals(appointmentId, appointment.getAppointmentId());
        Assertions.assertEquals(buyerId, appointment.getBuyerId());
        Assertions.assertEquals(description, appointment.getDescription());
        Assertions.assertEquals(dateTime, appointment.getDateTime());
        Assertions.assertEquals(location, appointment.getLocation());
        System.out.println(appointment.toString());
    }

}