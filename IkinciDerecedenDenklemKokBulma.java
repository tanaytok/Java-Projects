
public class IkinciDerecedenDenklemKokBulma {

	private static float Root1, Root2;  // ORTAK DEĞİŞKENLER
	
	public static void main(String[] args) 
	{
		int X, Y, Z;
		boolean ok;
		int controlFlag = Integer.parseInt(args[0]);
		
		if (controlFlag == 1)
		{
			X = Integer.parseInt(args[1]); // LAST-DEF OF X
			Y = Integer.parseInt(args[2]); // LAST-DEF OF Y
			Z = Integer.parseInt(args[3]); // LAST-DEF OF Z
		}
		else
		{
			X = 10; // LAST-DEF OF X
			Y = 9; // LAST DEF OF Y
			Z = 12; // LAST DEF OF Z
		}
		
		ok = Root(X,Y,Z);
		
		if (ok) // FIRST-USE OF OK
		{
			System.out.println("Kökler: " + Root1 + Root2); // FIRST-USE OF ROOT1 and ROOT2
		}
		else
		{
			System.out.println("Çözüm yok!");
		}
	}
	
	private static boolean Root(int A, int B, int C)
	{
		float D;
		boolean Result;
		
		D = (float)Math.pow(B,2) - 4 * (A*C); // FIRST-USE OF A, B and C / LAST-DEF OF D
		
		if (D < 0) // FIRST-USE OF D
		{
			Result = false; // LAST-DEF OF RESULT
			return(Result);
		}
		
		Root1 = (float) (-B + Math.sqrt(D) / (2 * A)); // FIRST USE OF ROOT1
		Root2 = (float) (-B + Math.sqrt(D) / (2 * A)); // FIRST USE OF ROOT2
		Result = true; // FIRST-USE OF RESULT
		return(Result);
	}
	
}
