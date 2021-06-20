package Assignments.BasicJava.Day5.Assignment6;

import java.util.Calendar;

public class Return extends Ticket{
    private Calendar onwardExpiryDate;
    private Calendar returnExpiryDate;

    public Return(){

    }

    public Calendar getOnwardExpiryDate() {
        return onwardExpiryDate;
    }

    public void setOnwardExpiryDate(Calendar onwardExpiryDate) {
        this.onwardExpiryDate = onwardExpiryDate;
    }

    public Calendar getReturnExpiryDate() {
        return returnExpiryDate;
    }

    public void setReturnExpiryDate(Calendar returnExpiryDate) {
        this.returnExpiryDate = returnExpiryDate;
    }

}
