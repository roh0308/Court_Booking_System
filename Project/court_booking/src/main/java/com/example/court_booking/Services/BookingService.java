package com.example.Court_Booking.Services;

import com.example.Court_Booking.DTO.BookingsDTO;
import org.springframework.http.ResponseEntity;

public interface BookingService {
    public ResponseEntity<String> createBooking(BookingsDTO bookingsDTO);
}
