public class Öğrenci {
	
	private String[] vizeSinavlari;
	private String[] finalSinavlari = {"Yazılım Kalite", "Doğal Dil İşleme", "İSG"};
	
	public String[] getVizeSinavlari()
	{
    	return vizeSinavlari;
	}
	public void setVizeSinavları(String[] vizeSinavlari)
	{
    	this.vizeSinavlari = vizeSinavlari;
	}
	
	public String[] getFinalSinavlari()
	{
    	return finalSinavlari;
	}
	public void setFinalSinavlari(String[] finalSinavlari)
	{
    	this.finalSinavlari = finalSinavlari;
	}
	
	public String sinavaGir()
	{
    	Ders ders = new Ders();
    	return ders.sinavGoster();
	}
	
}