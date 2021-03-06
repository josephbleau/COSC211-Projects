public class HourlyEmployee extends Employee{
	private double hourlyRate;
	private double hoursWorked;
	
	HourlyEmployee(int id, String name, Date date, double hourly_rate, double hours_worked) {
		super(id, name, date);
		this.setHourlyRate(hourly_rate);
		this.setHoursWorked(hours_worked);
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hours_worked) {
		this.hoursWorked = hours_worked;
	}
	
	public void print() {
		super.print();
		System.out.println("\tHourly Rate: " + this.hourlyRate);
		System.out.println("\tMax Hours: " + this.hoursWorked);
	}
}
