package BasicDataStructuresAssignments;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double principal = 10000.0; 
        double interestRate = 5.0; 
        double timePeriod = 10.0; 
        double compoundInterest = principal * Math.pow(1 + (interestRate / 100), timePeriod) - principal;
        System.out.println("Principal: " + principal);
        System.out.println("Interest rate: " + interestRate + "%");
        System.out.println("Time period: " + timePeriod + " years");
        System.out.println("Compound interest: " + compoundInterest);
	}

}
