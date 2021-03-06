import java.util.InputMismatchException;
import java.util.Scanner;

/* 
 * COSC 211 
 * Lab 3.1 - Exception Handling 
 * Joseph Bleau 
 */

public class Lab_3_1 {
	public static void main(String[] args) throws Exception {
		int n1, n2;
		double r;
		
		while(true) {
			try{
				Scanner scan = new Scanner( System.in );
				
				System.out.print("Enter a value for n1: ");
				n1 = scan.nextInt();
				
				System.out.print("Enter a value for n2: ");
				n2 = scan.nextInt();
				
				if(n2 == 0){
					throw new Exception("n2 cannot be zero as it is used later as a divisor");
				}
				
				r = (double)n1 / (double)n2;
				System.out.println("n1/n2 = " + r);
				System.exit(0);
				
			} catch (InputMismatchException e) {
				System.out.println("Exception caught: you must only enter numeric values for n1 and n2");
			} catch (Exception e) {
				System.out.println("Exception caught: " + e.getMessage());
			}
		}
	}
}