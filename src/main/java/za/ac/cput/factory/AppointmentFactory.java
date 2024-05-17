package za.ac.cput.factory;

import za.ac.cput.util.Helper;
import za.ac.cput.domain.Appointment;
import za.ac.cput.domain.Location;

import java.time.LocalDateTime;

public class AppointmentFactory {
    public static Appointment createAppointment(String appointmentId, String buyerId, String description, LocalDateTime dateTime, Location location) {
        if (Helper.isNullorEmpty(String.valueOf(appointmentId)) || Helper.isNullorEmpty(String.valueOf(buyerId)) ||
                Helper.isNullorEmpty(description) || dateTime == null || location == null) {
            return null;
        }

        return new Appointment.Builder()
                .setAppointmentId(appointmentId)
                .setBuyerId(buyerId)
                .setDescription(description)
                .setDateTime(dateTime)
                .setLocation(location)
                .build();
    }
}

