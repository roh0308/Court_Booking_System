package com.example.Court_Booking.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.LocalTime;

public class Time_SlotsDTO {
    private Long court_id;

    @JsonFormat(pattern = "HH:mm")
    private LocalTime start_time;

    @JsonFormat(pattern = "HH:mm")
    private LocalTime end_time;

    private LocalDate date;
    public Time_SlotsDTO() {}

    public Long getCourt_id() {
        return court_id;
    }

    public void setCourt_id(Long court_id) {
        this.court_id = court_id;
    }

    public LocalTime getStart_time() {
        return start_time;
    }

    public void setStart_time(LocalTime start_time) {
        this.start_time = start_time;
    }

    public LocalTime getEnd_time() {
        return end_time;
    }

    public void setEnd_time(LocalTime end_time) {
        this.end_time = end_time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
