public class CommissionedEmployee extends FullTimeHourlyEmployee {
	private double commission;
	
	CommissionedEmployee(int id, String name, Date date, double hourly_rate, 
			             int rank, double commission)
	{
		super(id, name, date, hourly_rate, rank);
		this.commission = commission;
	}
	
	double calculatePay()
	{
		return super.calculatePay() + commission;
	}
	
	public void print()
	{
		super.print();
		System.out.println("\tCommission: " + commission);
	}
}