package com.example.Court_Booking.Entity;

import jakarta.persistence.*;

@Entity
public class Courts {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long courtId;
    private String courtName;

    //Many courts can be linked to one property
    @ManyToOne
    @JoinColumn(name = "property_id", nullable = false)
    PropertyRegistration propertyRegistration;

    public Courts() {}

    public Courts(String courtName, PropertyRegistration propertyRegistration) {
        this.courtName = courtName;
        this.propertyRegistration = propertyRegistration;
    }

    public Long getCourtId() {
        return courtId;
    }

    public void setCourtId(Long courtId) {
        this.courtId = courtId;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public PropertyRegistration getPropertyRegistration() {
        return propertyRegistration;
    }

    public void setPropertyRegistration(PropertyRegistration propertyRegistration) {
        this.propertyRegistration = propertyRegistration;
    }
}
