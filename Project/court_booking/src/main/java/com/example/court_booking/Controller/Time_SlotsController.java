package com.example.Court_Booking.Controller;

import com.example.Court_Booking.DTO.Time_SlotsDTO;
import com.example.Court_Booking.Services.Time_SlotsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Time_SlotsController {
    @Autowired
    Time_SlotsService time_slotsService;

    @PostMapping("/createTimeSlots")
    public ResponseEntity<String>createTimeSlots(@Validated @RequestBody Time_SlotsDTO time_slotsDTO) {
        return time_slotsService.createTimeSlots(time_slotsDTO);
    }
}
