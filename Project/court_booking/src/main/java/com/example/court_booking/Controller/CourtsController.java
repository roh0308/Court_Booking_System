package com.example.Court_Booking.Controller;

import com.example.Court_Booking.DTO.CourtsDTO;
import com.example.Court_Booking.Services.CourtsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourtsController {

    @Autowired
    private CourtsService courtsService;

    @PostMapping("/createCourts")
    public ResponseEntity<String>createCourt(@RequestBody CourtsDTO courtsDTO){
        return courtsService.createCourts(courtsDTO);
    }


}
