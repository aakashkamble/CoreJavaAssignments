package ExceptionHandlingAssignments;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=10,n2=0;
		try {
			int res=n1/n2;
			System.out.println("The Result is:  "+res);
		}
		catch(ArithmeticException e) {
			System.out.println("Divide By Zero"+e);
		}

	}

}
