package BasicDataStructuresAssignments;

import java.util.Scanner;

public class MarksAverageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int [][] marks=new int[3][3];
		for(int i=0;i<3;i++) {
			System.out.println("Enter Marks: "+(i+1)+ ":");
			for(int j=0;j<3;j++) {
				System.out.println("Subject: "+(char)('A'+j)+ ":");
				marks[i][j]=sc.nextInt();
			}
		}
		int[] total=new int[3];
		double[] average=new double[3];
		for(int j=0;j<3;j++) {
			for(int i=0;i<3;i++) {
				total[j]+=marks[i][j];
				
			}
			average[j]=(double)total[j]/3;
			
		}
		int AllTotal=0;
		double AllAverage;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				AllTotal+=marks[i][j];
				
			}
		}
		AllAverage =(double)AllTotal/9;
		System.out.println("Subject Wise Results:");
		for(int j=0;j<3;j++) {
			System.out.println("Subject: "+ (char)('A'+j)+" Total:"+ total[j]+ "Average: "+average[j]);
		}
		System.out.println("All Total: "+ AllTotal);
		System.out.println("All Average : "+ AllAverage);
	}

}
