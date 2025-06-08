package com.example.Court_Booking.Repository;

import com.example.Court_Booking.Entity.Bookings;
import com.example.Court_Booking.Entity.Time_Slots;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Bookings,Long> {
    boolean existsBySlots(Time_Slots slot);

}
