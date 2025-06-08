package com.example.Court_Booking.Repository;

import com.example.Court_Booking.Entity.PropertyRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PropertyRegistrationRepository extends JpaRepository<PropertyRegistration, Long> {

    Optional<PropertyRegistration> findById(Long property_id);

}
