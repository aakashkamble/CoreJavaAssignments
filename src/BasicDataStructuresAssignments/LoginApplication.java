package BasicDataStructuresAssignments;

import java.util.Scanner;

public class LoginApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int loginAttempts=3;
		int attempts=0;
		
		String UserId="user123";
		String UserPassword="pass123";
		while(attempts< loginAttempts) {
			System.out.println("Enter your Login name");
			String inputUserId=sc.nextLine();
			
			System.out.println("Enter your Login password");
			String inputUserPassword=sc.nextLine();
			
			if(inputUserId.equals(UserId) && inputUserPassword.equals(UserPassword)) {
				System.out.println("Welcome" + UserId);
				break;
			}
			else
			{
				attempts++;
				System.out.println("Invalid Login Credentials "+(loginAttempts-attempts));
				
				if(attempts== loginAttempts) {
					System.out.println("Contact Admin Because Maximum login Attempts");
				}
			}
			
		}
		
		sc.close();

	}

}
