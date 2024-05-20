package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Appointment;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AppointmentFactoryTest {

    @Test
    void testBuildAppointment() {

        LocalDateTime dateTime = LocalDateTime.of(2020, 4, 23, 10, 0);
        Appointment appointment = AppointmentFactory.createAppointment("10", "2113", "pick up", dateTime);
        assertNotNull(appointment);
        System.out.println(appointment.toString());
    }

    @Test
    void testBuildAppointmentWithFail() {

        LocalDateTime dateTime = LocalDateTime.of(2020, 4, 23, 10, 0);
        Appointment appointment = AppointmentFactory.createAppointment("", "", "pick up", dateTime);
        assertNotNull(appointment);
        System.out.println(appointment.toString());
    }


}