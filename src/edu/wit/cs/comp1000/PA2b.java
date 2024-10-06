package edu.wit.cs.comp1000;
import java.util.Scanner;
/**
 * Solution to assignment PA2b. 
 * Takes 3 inputed numbers and calculates the discriminant. 
 * Uses the discriminant to calculate the roots
 * 
 * @author Nathaniel Niesen
 */
public class PA2b 
{

	/**
	 * Solution to assignment PA2b. 
	 * Takes in user inputs for 3 numbers. 
	 * Calculates the discriminant. 
	 * Checks if the roots are imaginary, and outputs that's case if that's so.
	 * Otherwise calculates the root(s) and lists them in ascending order.
	 */
	public static void main(String[] args) 
	{
		// setting variables
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0; // d is the discriminant
		Scanner input = new Scanner(System.in);
		
		// setting values for variables
		System.out.printf("Enter a b c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		// calculating discriminant
		d = (b*b) - (4 * a * c);
		// getting the imaginary out of the way 
		if (d < 0)
		{
			System.out.printf("Roots: imaginary%n");
		}
		// dealing with the case of only one root
		else if (d == 0)
		{
			// d is becoming the root since the discriminant is no longer needed
			d = -b / (2.0 * a);
			System.out.printf("Root: %.2f%n", d);
		}
		// fully calculating multiple roots
		else if (d > 0)
		{
			// e is the first root
			double e = (-b / (2.0 * a)) - (Math.sqrt(d) / (2.0 * a));
			// d is becoming the second root since the discriminant is no longer needed
			d = (-b / (2.0 * a)) + (Math.sqrt(d) / (2.0 * a));
			// making sure the roots are displayed in proper order
			if (e > d)
			{
				System.out.printf("Roots: %.2f, %.2f%n", d, e);
			}
			else
			{
				System.out.printf("Roots: %.2f, %.2f%n", e, d);
			}
		}
	}

}
