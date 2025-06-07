package com.example.Court_Booking.Services;

import com.example.Court_Booking.DTO.CourtsDTO;
import com.example.Court_Booking.Entity.Courts;
import org.springframework.http.ResponseEntity;

public interface CourtsService {
    ResponseEntity<String>createCourts(CourtsDTO courtsDTO);
}
