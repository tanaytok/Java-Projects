import java.net.PortUnreachableException;

public class Test {
	
	
	public static void main(String[] args) {
		
		IPayable[] payableObject = new IPayable[4];
		
		payableObject[0] = new Invoice("a", "b", 5, 4);
		payableObject[1] = new Invoice("c","d", 7, 8);
		payableObject[2] = new SalariedEmployee("e", "f", "g", 9);
		payableObject[3] = new SalariedEmployee("h", "r", "z", 10);
				
		for (IPayable iPayable : payableObject) 
		{
			System.out.println(iPayable);
		}
		
	}
	
}
