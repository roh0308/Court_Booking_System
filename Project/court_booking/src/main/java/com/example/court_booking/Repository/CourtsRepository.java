package com.example.Court_Booking.Repository;


import com.example.Court_Booking.Entity.Courts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourtsRepository extends JpaRepository<Courts,Long> {

}
