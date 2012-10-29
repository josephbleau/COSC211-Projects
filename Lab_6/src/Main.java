import java.util.ArrayList;

public class Main {

	public static ArrayList<Double> compInt(double b, double r, int t)
	{
		ArrayList<Double> results = new ArrayList<Double>();
		
		for(int i = 0; i < t; i++)
		{
			b += (b * r);
			results.add(b);
		}
		
		return results;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("$200 Principle compounded at a rate of 25% over four years.");
		ArrayList<Double> results = compInt(200, .25, 4);
		for(int i = 0; i < results.size(); i++)
		{
			System.out.println("Year " + (i+1) + ": " + results.get(i));
		}
	}
}
