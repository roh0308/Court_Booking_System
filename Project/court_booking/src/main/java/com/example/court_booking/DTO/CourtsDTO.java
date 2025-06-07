package com.example.Court_Booking.DTO;

public class CourtsDTO {
    private Long property_id;
    private String courtName;

    public CourtsDTO() {}

    public CourtsDTO(Long property_id, String courtName) {
        this.property_id = property_id;
        this.courtName = courtName;
    }

    public Long getProperty_id() {
        return property_id;
    }

    public void setProperty_id(Long property_id) {
        this.property_id = property_id;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }
}
