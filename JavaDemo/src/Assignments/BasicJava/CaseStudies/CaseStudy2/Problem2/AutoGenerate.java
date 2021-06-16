package Assignments.CaseStudies.CaseStudy2.Problem2;

public class AutoGenerate {
    private int companyCode;
    private char modeOfTravel;
    private int travelCode;
    private static int uniqueCode = 0000;
    private String bookingConfirmation;

    AutoGenerate(){
        uniqueCode++;
    }

    AutoGenerate(int companyCode,char modeOfTravel, int travelCode){
        this();
        this.companyCode = companyCode;
        this.modeOfTravel = modeOfTravel;
        this.travelCode = travelCode;
    }

    public void setBookingConfirmation(){
        String uCode = String.valueOf(uniqueCode);
        for (int i = 4 - String.valueOf(uniqueCode).length(); i>0; i--){
            uCode = "0"+uCode;
        }
        this.bookingConfirmation = String.valueOf(companyCode) + modeOfTravel + travelCode + uCode;
    }

    public String getBookingConfirmation(){
        return bookingConfirmation;
    }

    public static void main(String[] args) {
        AutoGenerate travelPlan = new AutoGenerate(112,'F',102);

        travelPlan.setBookingConfirmation();

        System.out.println("Booking confirmation: "+travelPlan.getBookingConfirmation());
    }
}
