package com.thetestingacademy.payload.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Bookingdates {

    private String checkin;

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    private String checkout;
}
