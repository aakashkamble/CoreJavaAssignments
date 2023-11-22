package BasicDataStructuresAssignments;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 153;
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        if (originalNumber == sum) {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number");
        }
	}

}
