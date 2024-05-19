package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Appointment;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
public class AppointmentServiceTest {
    private AppointmentService appointmentService;
    private static Appointment appointment1;
    private static Appointment appointment2;


    @Test
    void a_setup(){
        // appointment1 = AppointmentFactory.createAppointment("554","332","pickup", LocalDateTime.parse("2024,4,22,12.0","yyyy,M,d,H.m"));
        assertNotNull(appointment1);
        System.out.println(appointment1);
        //appointment2 = AppointmentFactory.createAppointment("2235", "978-545-01022-1","drop off", LocalDateTime.parse("2024,05,23,10,0"));
        assertNotNull(appointment2);
        System.out.println(appointment2);

    }
    @Test
    void b_create() {
        Appointment created1 = appointmentService.create(appointment1);
        assertNotNull(created1);
        System.out.println(created1);
        Appointment created2 = appointmentService.create(appointment2);
        assertNotNull(created2);
        System.out.println(created2);
    }
    @Test
    void c_read() {
        Appointment read = appointmentService.read(appointment1.getAppointmentId());
        assertNotNull(read);
        System.out.println(read);
    }
    @Test
    void d_update() {
        Appointment newAppointment  = new Appointment.Builder().copy(appointment2).setBuyerId("121").build();
        Appointment updated = appointmentService.update(newAppointment);
        assertNotNull(updated);
        System.out.println(updated);
    }
    @Test
    void e_getall() {
        System.out.println(appointmentService.getall());
    }


}