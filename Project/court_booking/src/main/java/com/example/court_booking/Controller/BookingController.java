package com.example.Court_Booking.Controller;

import com.example.Court_Booking.DTO.BookingsDTO;
import com.example.Court_Booking.Services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/createBooking")
    public ResponseEntity<String> createBooking(@RequestBody @Validated BookingsDTO bookingsDTO){
        return bookingService.createBooking(bookingsDTO);
    }
}
