package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Location;

public interface LocationRepository extends JpaRepository<Location, String> {
    Location findLocationByAddress(String address);

    void deleteLocationByAddress(String address);
    void deleteLocationByContactInformation(String contactInformation);
}