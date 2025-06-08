package com.example.Court_Booking.Services.Implementation;

import com.example.Court_Booking.DTO.BookingsDTO;
import com.example.Court_Booking.Entity.Bookings;
import com.example.Court_Booking.Entity.Roles;
import com.example.Court_Booking.Entity.Time_Slots;
import com.example.Court_Booking.Entity.User;
import com.example.Court_Booking.Enum.Role;
import com.example.Court_Booking.Repository.BookingRepository;
import com.example.Court_Booking.Repository.RolesRepository;
import com.example.Court_Booking.Repository.Time_slotsRepository;
import com.example.Court_Booking.Repository.UserRepository;
import com.example.Court_Booking.Services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookingImplementation implements BookingService {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    Time_slotsRepository time_slotsRepository;

    RolesRepository rolesRepository;

    @Override
    public ResponseEntity<String>createBooking(BookingsDTO bookingsDTO) {
        Optional<User> OptionalUser=userRepository.findById(bookingsDTO.getUserId());
        Optional<Time_Slots> OptionalTimeSlots=time_slotsRepository.findById(bookingsDTO.getSlotId());

        if (OptionalUser.isEmpty() || OptionalTimeSlots.isEmpty()) {
            return ResponseEntity.badRequest().body("Invalid user or slot ID");
        }


        User user=OptionalUser.get();
        Time_Slots timeSlots=OptionalTimeSlots.get();

        boolean hasUserRole=false;
        for(Roles role:user.getRoles()){
            if(role.getRole()==Role.USER){
                hasUserRole=true;
                break;
            }
        }
        if(!hasUserRole){
            return ResponseEntity.badRequest().body("Only users with role 'USER' can book slots.");
        }


        boolean isSlotBooked = bookingRepository.existsBySlots(timeSlots);
        if (isSlotBooked) {
            return ResponseEntity.badRequest().body("The selected time slot is already booked.");
        }

        Bookings bookings=new Bookings();
        bookings.setUser(user);
        bookings.setSlots(timeSlots);
        bookingRepository.save(bookings);
        return ResponseEntity.ok("Booking created successfully");
    }
}
