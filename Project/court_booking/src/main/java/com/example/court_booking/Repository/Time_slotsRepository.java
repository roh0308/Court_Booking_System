package com.example.Court_Booking.Repository;

import com.example.Court_Booking.Entity.Time_Slots;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Time_slotsRepository extends JpaRepository<Time_Slots,Long> {
    Optional<Time_Slots> findById(Long time_slots_id);
}
