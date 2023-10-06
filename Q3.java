import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// This code reads Celsius degrees in order to convert it to Fahrenheit degrees.
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		
		// Formula to convert Celsius degrees to Fahrenheit degrees
		double fahrenheit = (9.0/5)*celsius+32;
		System.out.println("Celsius " + celsius + " is " + fahrenheit + " in fahrenheit");

	}

}
