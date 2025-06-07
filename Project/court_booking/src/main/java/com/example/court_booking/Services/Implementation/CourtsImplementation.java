package com.example.Court_Booking.Services.Implementation;


import com.example.Court_Booking.DTO.CourtsDTO;
import com.example.Court_Booking.DTO.PropertyRegistrationDTO;
import com.example.Court_Booking.Entity.Courts;
import com.example.Court_Booking.Entity.PropertyRegistration;
import com.example.Court_Booking.Entity.User;
import com.example.Court_Booking.Repository.CourtsRepository;
import com.example.Court_Booking.Repository.PropertyRegistrationRepository;
import com.example.Court_Booking.Services.CourtsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourtsImplementation implements CourtsService {

    @Autowired
    CourtsRepository courtsRepository;

    @Autowired
    PropertyRegistrationRepository propertyRegistrationRepository;

    @Override
    public ResponseEntity<String> createCourts(CourtsDTO courtsDTO){
        Optional<PropertyRegistration>property=propertyRegistrationRepository.findById(courtsDTO.getProperty_id());

        if (property.isEmpty()) {
            return ResponseEntity.badRequest().body("Invalid property ID");
        }
        //Extract the value
        PropertyRegistration propertyRegistration=property.get();

        Courts court=new Courts();
        court.setCourtName(courtsDTO.getCourtName());
        court.setPropertyRegistration(propertyRegistration);

        courtsRepository.save(court);
        return ResponseEntity.ok("Courts Created Successfully");

    }


}
