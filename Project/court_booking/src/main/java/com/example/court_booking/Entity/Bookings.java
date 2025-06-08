package com.example.Court_Booking.Entity;

import jakarta.persistence.*;

@Entity
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingID;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    User user;

    @ManyToOne
    @JoinColumn(name = "slot_id", nullable = false)
    Time_Slots slots;

    public Bookings() {}

    public Long getBookingID() {
        return bookingID;
    }

    public void setBookingID(Long bookingID) {
        this.bookingID = bookingID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Time_Slots getSlots() {
        return slots;
    }

    public void setSlots(Time_Slots slots) {
        this.slots = slots;
    }
}
