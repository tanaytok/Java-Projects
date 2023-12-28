
public class Test1 {

	public static void main(String[] args) {
		
		Customer customerObj = new Customer();
		Student studentObj = new Student();
		
		customerObj.log();
		studentObj.log();
		
		IDatabase database = new Customer();
		database.log();
		
	}
}
