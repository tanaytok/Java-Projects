package HesapMakinesiTest;

public class HesapMakinesi implements IHesapMakinesi {

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int subtraction(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public int division(int a, int b) throws Exception {
		// TODO Auto-generated method stub
		if (b == 0)
		{
			throw new Exception("Divider can not be zero.");
		}
		return a / b;
	}

	@Override
	public boolean equalIntegers(int a, int b) {
		// TODO Auto-generated method stub
		boolean result = false;
		
		if (a == b)
		{
			result = true;
		}
		return result;
	}

}
