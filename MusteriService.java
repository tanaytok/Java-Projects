package MusteriTest;

public class MusteriService 
{
	private MusteriRepository musteriRepository;
	private BilgilendirmeService bilgilendirmeService;
	
	public void musteriKaydet(Musteri musteri)
	{
		musteriRepository.kaydet(musteri);
		bilgilendirmeService.yeniKayıtMailGonder(musteri);
	}
	
	public void musteriSil(Integer musteriId)
	{
		musteriRepository.sil(musteriId);
	}
	
	public void setMusteriRepository(MusteriRepository musteriRepsitory)
	{
		this.musteriRepository = musteriRepository;
	}
	
	public void setBilgilendirmeService(BilgilendirmeService bilgilendirmeService)
	{
		this.bilgilendirmeService = bilgilendirmeService;
	}
}
