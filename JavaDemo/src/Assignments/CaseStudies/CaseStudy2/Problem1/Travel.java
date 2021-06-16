package Assignments.CaseStudies.CaseStudy2.Problem1;

public class Travel {
    private char modeOfTravel;
    private int noOfTickets;
    private double amount;

    public char getModeOfTravel(){
        return modeOfTravel;
    }
    public int getNoOfTickets(){
        return noOfTickets;
    }
    public double getAmount(){
        return amount;
    }

    public void setModeOfTravel(char modeOfTravel){
        this.modeOfTravel = modeOfTravel;
    }
    public void setNoOfTickets(int noOfTickets){
        this.noOfTickets =noOfTickets;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
}
