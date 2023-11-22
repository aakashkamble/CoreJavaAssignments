package BasicDataStructuresAssignments;

public class ArmStrongTo100To999 {
	
	public static void main(String[] args) {
		 for (int number = 100; number <= 999; number++) {
	            int originalNumber = number;
	            int sum = 0;
	            int temp = number;
	            int digits = 0;
	            while (temp != 0) {
	                digits++;
	                temp /= 10;
	            }

	           
	            temp = number;
	            while (temp != 0) {
	                int remainder = temp % 10;
	                sum += Math.pow(remainder, digits);
	                temp /= 10;
	            }

	           
	            if (originalNumber == sum) {
	                System.out.println(originalNumber + " is an Armstrong number");
	            }
	        }
	    }
	}


