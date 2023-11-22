package BasicDataStructuresAssignments;

import java.util.Scanner;

public class ResultDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks for Subject 1:");
		int subject1=sc.nextInt();
		
		System.out.println("Enter marks for Subject 2:");
		int subject2=sc.nextInt();
		
		System.out.println("Enter marks for Subject 3:");
		int subject3=sc.nextInt();
		
		if(subject1>60 && subject2>60 && subject3>60) {
			System.out.println("Passed");
		}
		else if(subject1>60 && subject2>60) {
			System.out.println("Promoted");
		}
		else if(subject1>60 && subject2>60 && subject3>60 || (subject1<60 && subject2<60 && subject3<60)) {
			System.out.println("Failed");
		}
		sc.close();
	}

}
