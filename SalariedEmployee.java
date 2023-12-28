
public class SalariedEmployee extends Employee {

	private double weeklySalary;
	
	
	public SalariedEmployee(String firstName, String lastName, String sSN, double weeklySalary) 
	{
		super(firstName, lastName, sSN);
		setWeeklySalary(weeklySalary);
	}

	
	public double getWeeklySalary() 
	{
		return weeklySalary;
	}

	
	public void setWeeklySalary(double weeklySalary)
	{
		this.weeklySalary = weeklySalary>0?weeklySalary:0;
	}

	public double getPaymentAmount() 
	{
		return getWeeklySalary();
	}
	
	
	public String toString() 
	{
		return super.toString() + "Weekly Salary:" + getWeeklySalary();
	}

}
