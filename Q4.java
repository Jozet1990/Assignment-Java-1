import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		//  The code reads an integer between 0 and 1000 and add all the digits in the integer.
		Scanner input = new Scanner(System.in);
		System.out.println("Write a number between 0 and 1000: ");
		// User enters a number between 0 and 1000.
		int num = input.nextInt();
		//Get digits from the user
		int pos = Integer.toString(num).length();
		int num1 = ((num / 100) % 10);
		int num2 = ((num / 10) % 10);
		int num3 = ((num / 1) % 10);
		//Get the result of adding individual numbers
		System.out.println ("The add of individual numers is");
		System.out.println(num1 + num2 + num3);
		
		
	}

}
