
public abstract class Employee implements IPayable {
	
	private String firstName, lastName, SSN;

	public Employee(String firstName, String lastName, String sSN) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		SSN = sSN;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getSSN()
	{
		return SSN;
	}

	public void setSSN(String sSN) 
	{
		SSN = sSN;
	}
	
	public String toString() 
	{
		return "First Name:" + getFirstName() + "\n Last Name:" + getLastName() + "\n SSN:" + getSSN();
	}
	
	
	
}
