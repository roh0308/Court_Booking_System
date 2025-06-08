package com.example.Court_Booking.DTO;

public class BookingsDTO {
    private Long userId;
    private Long slotId;

    public BookingsDTO() {}


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getSlotId() {
        return slotId;
    }

    public void setSlotId(Long slotId) {
        this.slotId = slotId;
    }
}
