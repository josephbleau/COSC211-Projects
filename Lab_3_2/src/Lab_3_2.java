/* 
 * COSC 211 
 * Lab 3.1 - Part 2 -  Exception Handling 
 * Joseph Bleau 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab_3_2 {
	
	
	public static double calcRatio(int numerator, int denumerator) throws DivideByZeroException
	{
		if(denumerator == 0)
			throw new DivideByZeroException("Cannot divide by zero");
		
		return (double)numerator/(double)denumerator;
	}
	
	public static double getRatio() throws DivideByZeroException, InputMismatchException
	{
		int n1, n2;
		
		Scanner scan = new Scanner( System.in );
		
		System.out.print("Enter a value for n1: ");
		n1 = scan.nextInt();
		
		System.out.print("Enter a value for n2: ");
		n2 = scan.nextInt();
		
		return calcRatio(n1,n2);
	}
	
	public static void main(String[] args) throws Exception {		
		while(true) {
			try{
				double r = getRatio();
				
				System.out.println("n1/n2 = " + r);
				System.exit(0);
				
			} catch (InputMismatchException e) {
				System.out.println("Exception caught: you must only enter numeric values for n1 and n2");
			} catch (DivideByZeroException e) {
				System.out.println("Exception caught: " + e.getMessage());
			}
		}
	}
}