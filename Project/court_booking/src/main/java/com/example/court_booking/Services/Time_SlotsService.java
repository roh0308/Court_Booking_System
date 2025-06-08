package com.example.Court_Booking.Services;

import com.example.Court_Booking.DTO.Time_SlotsDTO;
import org.springframework.http.ResponseEntity;

public interface Time_SlotsService {
    ResponseEntity<String>createTimeSlots(Time_SlotsDTO timeSlotsDTO);
}
