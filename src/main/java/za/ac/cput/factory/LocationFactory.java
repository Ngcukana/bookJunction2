package za.ac.cput.factory;

import za.ac.cput.util.Helper;
import za.ac.cput.domain.Location;

public class LocationFactory {
    public static Location createLocation(String address, String contactInformation, String operatingHours, String city) {
        if (Helper.isNullorEmpty(address) || Helper.isNullorEmpty(contactInformation) ||
                Helper.isNullorEmpty(operatingHours) || Helper.isNullOrEmpty(city)) {
            return null;
        }

        return new Location.Builder()
                .setAddress(address)
                .setContactInformation(contactInformation)
                .setOperatingHours(operatingHours)
                .setCity(city)
                .build();
    }
}
