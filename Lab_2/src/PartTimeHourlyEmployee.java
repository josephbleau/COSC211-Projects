public class PartTimeHourlyEmployee extends HourlyEmployee{
	private Date terminationDate;
	
	PartTimeHourlyEmployee(int id, String name, Date date, double hourly_rate, int max_hours, Date termination)
	{
		super(id, name, date, hourly_rate, max_hours);
		this.setTerminationDate(termination);
	}

	public Date getTerminationDate() {
		return terminationDate;
	}

	public void setTerminationDate(Date terminationDate) {
		this.terminationDate = terminationDate;
	}
	
	public void print()
	{
		super.print();
		System.out.println("\tTermination Date: " + terminationDate);
	}
}
