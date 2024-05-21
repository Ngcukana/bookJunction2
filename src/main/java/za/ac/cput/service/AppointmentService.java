package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Appointment;
import za.ac.cput.repository.AppointmentRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AppointmentService implements IAppointmentService {

    private AppointmentRepository repository;

    @Autowired
    public AppointmentService(AppointmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Appointment create(Appointment appointment) {
        return repository.save(appointment);
    }

    @Override
    public Appointment read(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Appointment not found with id: " + id));
    }

    @Override
    public Appointment update(Appointment appointment) {

        return repository.save(appointment);
    }

    @Override
    public List<Appointment> getall() {
        return null;
    }
}