package Assignments.BasicJava.Day5.Assignment6;

import java.util.Calendar;

public class MultiUse extends Ticket {
    private int tripLimit;
    private Calendar expireyDate;
    private int tripCount;

    public MultiUse(){

    }

    public int getTripLimit() {
        return tripLimit;
    }

    public void setTripLimit(int tripLimit) {
        this.tripLimit = tripLimit;
    }

    public Calendar getExpireyDate() {
        return expireyDate;
    }

    public void setExpireyDate(Calendar expireyDate) {
        this.expireyDate = expireyDate;
    }

    public int getTripCount() {
        return tripCount;
    }

    public void setTripCount(int tripCount) {
        this.tripCount = tripCount;
    }

    public void calculateTripCount(){

    }
}
