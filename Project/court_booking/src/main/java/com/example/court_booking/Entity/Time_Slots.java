package com.example.Court_Booking.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Time_Slots {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long timeSlotId;
    private LocalTime startTime;
    private LocalTime endTime;
    private boolean isBooked;
    private LocalDate date;

    @ManyToOne()
    @JoinColumn(name = "court_id", nullable = false)
    Courts courts;

    public Time_Slots() {}

    public Long getTimeSlotId() {
        return timeSlotId;
    }

    public void setTimeSlotId(Long timeSlotId) {
        this.timeSlotId = timeSlotId;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Courts getCourts() {
        return courts;
    }

    public void setCourts(Courts courts) {
        this.courts = courts;
    }
}
