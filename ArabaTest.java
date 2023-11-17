
public class ArabaTest {

	
	public static void main(String[] args) {
		
		
		Araba arabaobj = new Araba("A3","1","Siyah","Edremit",50,0,0,100,true);
		
		arabaobj.arttirBenzinMiktari(500);
		arabaobj.baslat(3);
		arabaobj.gitIleri(1);
		arabaobj.gitGeri(2);
		System.out.println(arabaobj.getBenzinMiktari());
		arabaobj.arttirHiz();
		arabaobj.baslat(2);
		arabaobj.kontroletRadar();
		System.out.println(arabaobj.getisRenkli());
		
		if (arabaobj.getMod() == 1)
		{
			System.out.println(arabaobj.getisRenkli());
		}
		else
		{
			System.out.println(arabaobj.getRenk());
		}
		
		arabaobj.azaltHiz();
		arabaobj.gitIleri(1);
		arabaobj.gosterBilgi();
		
	}
	
}
