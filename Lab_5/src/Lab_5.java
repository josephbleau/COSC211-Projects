import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Lab_5 {

	public static int factorial(int n)
	{
		if(n==0)
			return 1;
		
		return n * factorial(n-1);
	}
	
	public static void printStars(int n)
	{
		if(n==0)
			return;
		
		printStars(n-1);
		
		for(int i = 0; i < n; i++)
			System.out.print("*");
		
		System.out.println();
	}
	
	public static int gcd(int a, int b, int t)
	{
		if(a % t == 0 && b % t == 0)
			return t;
		else
			return gcd(a,b,t-1);
	}
	
	public static int gcd(int a, int b)
	{
		return gcd(a,b,b);
	}
	
	public static void printRecursiveDirectoryList(String path)
	{
		File directory = new File(path);
		
		if(!directory.exists() || !directory.isDirectory())
		{
			System.out.println("Path " + path + " does not exist or is not a directory.");
			return;
		}
		
		System.out.println(path);
		for(int i = 0; i < directory.listFiles().length; i++)
		{
			// Ignore relative path files.
			if(directory.listFiles()[i].isDirectory()){
				if(directory.listFiles()[i].toString() == "." || 
				   directory.listFiles()[i].toString() == "..")
					return;
				
				printRecursiveDirectoryList(directory.listFiles()[i].toString());
			} else
			{
				System.out.println(directory.listFiles()[i].toString());
			}
		}
	}
	
	public static void printRecursiveDirectoryList()
	{
		for(int i = 0; i < File.listRoots().length; i++)
		{
			printRecursiveDirectoryList(File.listRoots()[i].toString());
		}
	}
	
	public static void main(String[] args) {
		System.out.println("The factorial of 10 is: " + factorial(10));

		System.out.println("Printing a 5-tall star triangle.");
		printStars(5);
		
		System.out.println("The greatest common divisor of 50 and 20 is: " + gcd(50,20));
		
		printRecursiveDirectoryList("/home/jbleau/Dev/");
	}

}
