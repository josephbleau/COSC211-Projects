public class FullTimeHourlyEmployee extends HourlyEmployee{
	private int rank;
	
	public FullTimeHourlyEmployee(int id, String name, Date date, double hourly_rate, int rank)
	{
		super(id, name, date, hourly_rate, 40);
		if(rank < 1 || rank > 3) {
			System.out.println("Rank may only be between 1-3 (inclusive) for a FullTimeHourlyEmployee, defaulted to 1.");
			this.setRank(1);
		}
		else
		{
			this.setRank(rank);
		}
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		if(rank < 1 || rank > 3) {
			System.out.println("Rank may only be between 1-3 (inclusive) for a FullTimeHourlyEmployee.");
		}
		else {
			this.rank = rank;
		}
	}
	
	public void print() {
		super.print();
		System.out.println("\tRank: " + this.rank);
	}
}
