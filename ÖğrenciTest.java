import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class ÖğrenciTest {

    private Ders ders;
    private Öğrenci ogrenci;

	void setUp()
	{
    	ders = new Ders();
    	ogrenci = new Öğrenci();
	}
	
	void test()
	{
    	String sonuc = ders.sinavTanimla("İSG", "2025-01-23", 15);
    	assertEquals(sonuc, ogrenci.sinavaGir());
	}

}
