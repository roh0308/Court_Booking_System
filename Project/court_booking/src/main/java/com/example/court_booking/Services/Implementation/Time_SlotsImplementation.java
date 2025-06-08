package com.example.Court_Booking.Services.Implementation;

import com.example.Court_Booking.DTO.Time_SlotsDTO;
import com.example.Court_Booking.Entity.Courts;
import com.example.Court_Booking.Entity.Time_Slots;
import com.example.Court_Booking.Repository.CourtsRepository;
import com.example.Court_Booking.Repository.Time_slotsRepository;
import com.example.Court_Booking.Services.Time_SlotsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Time_SlotsImplementation implements Time_SlotsService {

    @Autowired
    Time_slotsRepository time_slotsRepository;

    @Autowired
    CourtsRepository courtsRepository;

    @Override
    public ResponseEntity<String> createTimeSlots(Time_SlotsDTO time_slotsDTO){
        Optional<Courts>optionalCourts=courtsRepository.findById(time_slotsDTO.getCourt_id());
        if(optionalCourts.isEmpty()){
            return ResponseEntity.badRequest().body("Courts Not Found");
        }

        Courts courts=optionalCourts.get();

        Time_Slots timeSlots=new Time_Slots();
        timeSlots.setCourts(courts);
        timeSlots.setStartTime((time_slotsDTO.getStart_time()));
        timeSlots.setEndTime(time_slotsDTO.getEnd_time());
        timeSlots.setDate(time_slotsDTO.getDate());
        timeSlots.setBooked(false);
        time_slotsRepository.save(timeSlots);
        return ResponseEntity.ok("Time Slots Created Successfully");
    }
}