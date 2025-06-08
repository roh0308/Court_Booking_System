package com.example.Court_Booking.Repository;


import com.example.Court_Booking.Entity.Courts;
import com.example.Court_Booking.Entity.PropertyRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourtsRepository extends JpaRepository<Courts,Long> {
    Optional<Courts>findById(Long courtId);
}
