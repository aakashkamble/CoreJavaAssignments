package BasicDataStructuresAssignments;

import java.util.Scanner;

public class IncomeTaxCalculator {

	public static double calculateTax(double income) {
		
		if( income<=180000) {
			
			System.out.println("");
			return 0;
		}
		else if(income<=300000) {
			
			return 0.1*(income-180000);
		}
		else if(income<=500000)
		{
			return 0.1*(300000-180000)+0.2*(income-300000);
		}
		else {
			return 0.1*(300000-180000)+0.2*(500000-300000)+0.3*(income-500000);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter CTC");
		double ctc=sc.nextDouble();
		
		double taxIncome=ctc-180000;
		double taxAmount=calculateTax(taxIncome);
		System.out.println("Your income Tax Amount is: "+taxAmount);
		
		sc.close();

	}

}
