package MusteriTest;

import java.util.HashMap;
import java.util.Map;

public class MusteriRepositoryStub extends MusteriRepository{

	private Map<Integer, Musteri> musteriListesi = new HashMap<Integer, Musteri>();
	
	public void kaydet(Musteri musteri)
	{
		musteriListesi.put(musteri.getId(), musteri);
	}
	
	public void sil(Integer musteriId)
	{
		musteriListesi.remove(musteriId);
	}
	
	public Musteri bul(Integer musteriId)
	{
		return musteriListesi.get(musteriId);
	}
}
