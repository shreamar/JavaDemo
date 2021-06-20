package Assignments.BasicJava.Day5.Assignment6;

public class OneTime extends Ticket {
    private boolean isTicketUsed;

    public OneTime() {
    }

    public boolean isTicketUsed() {
        return isTicketUsed;
    }

    public void setTicketUsed(boolean ticketUsed) {
        isTicketUsed = ticketUsed;
    }
}
