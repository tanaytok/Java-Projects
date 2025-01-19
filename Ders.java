import java.util.Date;

public class Ders {

    private Sınav sinav;
    
    public String sinavTanimla(String sinavAdi, String sinavTarihi, int sinavSoru)
    {
        return sinavAdi + sinavTarihi + sinavSoru;
    }
    
    public String sinavGoster()
    {
        return sinavTanimla("İSG", "2025-01-23", 15);
    }
	
}
