package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, String> {
}
