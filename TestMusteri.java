package MusteriTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

class TestMusteri {
	
	private MusteriRepositoryStub musteriRepository = new MusteriRepositoryStub();
	private BilgilendirmeService bilgilendirmeService = new BilgilendirmeService();
	private MusteriService musteriService = new MusteriService();

	@BeforeEach
	void setUp() throws Exception 
	{
		musteriService = new MusteriService();
		bilgilendirmeService = Mockito.mock(BilgilendirmeService.class);
		musteriService.setMusteriRepository(musteriRepository);
		musteriService.setBilgilendirmeService(bilgilendirmeService);
	}

	@Test
	void testMusteriKaydet() 
	{
		Musteri musteri = new Musteri(1235);
		musteriService.musteriKaydet(musteri);
		
		assertEquals(musteri, musteriRepository.bul(musteri.getId()));
		Mockito.verify(bilgilendirmeService).yeniKayıtMailGonder(musteri);
	}

}
