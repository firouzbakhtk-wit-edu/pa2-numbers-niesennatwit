package edu.wit.cs.comp1000;
import java.util.Scanner;
// TODO: document this class
public class PA2a 
{

	// TODO: document this function
	public static void main(String[] args) 
	{
		//setting variables
		int num[] = {0,0,0,0,0};
		int pos[] = {0,0,0,0,0};
		double posCount = 0;
		int non[] = {0,0,0,0,0};
		double nonCount = 0;
		Scanner input = new Scanner(System.in);
		
		//getting user input
		System.out.printf("Enter five whole numbers: ");
		for(int i = 0; i<5; i++)
		{
			num[i] = input.nextInt();
			if (num[i] > 0) {pos[i] = num[i]; posCount++;}
			else {non[i] = num[i]; nonCount++;}
		}
		input.close();
		
		//positive sum
		int posSum = pos[0]+pos[1]+pos[2]+pos[3]+pos[4];
		System.out.printf("The sum of the %.0f positive numbers: %d%n", posCount, posSum);
		
		//non positive sum
		int nonSum = non[0]+non[1]+non[2]+non[3]+non[4];
		System.out.printf("The sum of the %.0f non-positive numbers: %d%n", nonCount, nonSum);
		
		//total sum
		int numSum = num[0]+num[1]+num[2]+num[3]+num[4];
		System.out.printf("The sum of the %d numbers: %d%n", 5, numSum);
		
		//positive average
		System.out.printf("The average of the %.0f positive numbers: %.2f%n", posCount, posSum/posCount);
		
		//non positive average
		System.out.printf("The average of the %.0f non-positive numbers: %.2f%n", nonCount, nonSum/nonCount);
		
		//total average
		System.out.printf("The average of the %d numbers: %.2f%n", 5, numSum/5.0);
		
	}

}
