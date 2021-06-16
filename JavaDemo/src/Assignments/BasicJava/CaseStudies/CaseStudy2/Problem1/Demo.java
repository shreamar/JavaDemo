package Assignments.CaseStudies.CaseStudy2.Problem1;

public class Demo {
    public static void main(String[] args) {
        Travel travel = new Travel();
        travel.setModeOfTravel('F');
        travel.setNoOfTickets(3);

        int serviceCharge = 0;
        if(travel.getModeOfTravel() == 'F'){
            serviceCharge = 500;
        }
        else if(travel.getModeOfTravel() == 'T'){
            serviceCharge = 100;
        }
        else if(travel.getModeOfTravel()=='B'){
            serviceCharge = 50;
        }

        travel.setAmount(serviceCharge*travel.getNoOfTickets());

        System.out.println("Mode of trave: "+travel.getModeOfTravel());
        System.out.println("No. of tickets: "+travel.getNoOfTickets());
        System.out.println("Total service charge: $"+travel.getAmount());
    }
}
