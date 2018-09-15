package tempProjects;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter some number here:  ");
		int user_input_Number = sc.nextInt(); // nextInt is for int
		System.out.println("The entered values is:  ");
		System.out.println(user_input_Number);
		
		
		Scanner sc2 = new Scanner (System.in);
		System.out.println("Enter some decimal here:  ");
		double user_Input_number2 = sc2.nextDouble(); // nextInt is for double decimal values
		System.out.println("The entered values is:  ");
		System.out.println(user_Input_number2);
		
		Scanner sc3 = new Scanner (System.in);
		System.out.println("Enter some TEXT here:  "); // Entering Texts
		String User_Input_Number3 = sc3.nextLine();
		System.out.println("You entered string is:  ");
		System.out.println(User_Input_Number3);
		
		
		
	}

}
