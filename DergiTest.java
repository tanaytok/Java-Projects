package DergiTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DergiTest {


	void test() 
	{
		//Arrange
		Dergi dg = new Dergi();
		
		//Act
		String sonuc = dg.Adgetir();
		
		//Assert
		assertEquals("Çalışır",sonuc);
	}

}
