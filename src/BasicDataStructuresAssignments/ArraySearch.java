package BasicDataStructuresAssignments;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int a=sc.nextInt();
		boolean b=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==a)
			{
				b=true;
				break;
			}
		}
		if(b) {
			System.out.println(a+ " is number present in Array ");
			
		}
		else
		{
			System.out.println(a+ " is not number present in Array ");
		}
	}

}
