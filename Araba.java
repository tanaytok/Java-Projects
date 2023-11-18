import java.util.Random;

public class Araba {
	
		private String model;
		private String yas;
		private String renk;
		private String konum;
		private int hiz;
		private int alacagiyol;
		private int mod;
		private int yol;   // Arabanın başlangıç noktasına uzaklığı.
		private int benzinMiktari;
		private boolean isRenkli;
		
		public Araba (String model, String yas, String renk, String konum, int hiz, int mod, int yol, int benzinMiktari, boolean isRenkli)
		{
			this.benzinMiktari = benzinMiktari;
			this.hiz = hiz;
			this.isRenkli = isRenkli;
			this.konum = konum;
			this.mod = mod;
			this.model = model;
			this.renk = renk;
			this.yas = yas;
			this.yol = yol;
			
		}
		
		// AŞAĞI TARAF = SET METODLARI
		
		public void setModel (String model)
		{
			this.model = model;
		}
		
		
		public void setYas (String yas)
		{
			this.yas = yas;
		}
		
		
		public void setRenk (String renk)
		{
			this.renk = renk;
		}
		
		
		public void setKonum(String konum)
		{
			this.konum = konum;
		}
		
		
		public void setHiz(int hiz)
		{
			this.hiz = hiz;
		}
		
		
		public void setMod(int mod)
		{
			this.mod = mod;
		}
		
		
		public void setYol(int yol)
		{
			this.yol = yol;
		}
		
		
		public void setbenzinMiktarı(int benzinMiktari)
		{
			this.benzinMiktari = benzinMiktari;
		}
		
		
		public void setisRenkli(boolean isRenkli)
		{
			this.isRenkli = isRenkli;
		}
		
		// AŞAĞI TARAF = GET METODLARI
		
		public String getModel()
		{
			return model;
		}
		
		
		public String getYas()
		{
			return yas;
		}
		
		
		public String getRenk()
		{
			return renk;
		}
		
		
		public String getKonum()
		{
			return konum;
		}
		
		
		public Integer getHiz()
		{
			return hiz;
		}
		
		
		public Integer getMod()
		{
			return mod;
		}
		
		
		public Integer getYol()
		{
			return yol;
		}
		
		
		public Integer getBenzinMiktari()
		{
			return benzinMiktari;
		}
		
		
		public boolean getisRenkli()
		{
			return isRenkli;
		}
		
		
		// METODLAR
		
		
		public void arttirBenzinMiktari(int z)
		{
			
			benzinMiktari += z;
		
		}
		
		
		public void azaltBenzinMiktari(int z)
		{
			
			benzinMiktari -= z;
		}
		
		
		public void baslat(int saat)
		{
			int alacagiyol = hiz * saat;
			
			if (benzinMiktari > alacagiyol)
			{
				
			yol += alacagiyol;
			konumBelirleme(yol);
			
			}
			else
			{
				System.out.println("Benzin yok!");
			}
		}
		
		
		public void konumBelirleme(int a)
		{
			if (a < 51 && a > 0)
			{
				konum = "Edremit";
			}
			else if (a > 50 && a < 101)
			{
				konum = "Marmara";
			}
			else if (a > 100 && a < 151)
			{
				konum = "Erdek";
			}
			else if (a > 150 && a < 201)
			{
				konum = "AltıEylül";
			}
			else if (a > 200 && a < 251)
			{
				konum = "Bandırma";
			}
			else if (a < 0 && a > 250)
			{
				System.out.println("Seçili konuma gidemezsiniz.");
			}
		}
		
		
		public void gitIleri(int saat)
		{
			if (benzinMiktari < alacagiyol)
			{
				
				System.out.println("Yeterli benzin yok.");
				
				
			}
			else if (benzinMiktari > alacagiyol)
			{
				
				alacagiyol += saat * hiz;
				
				azaltBenzinMiktari(alacagiyol);
				konumBelirleme(alacagiyol + yol);
				
			}
			
		}
		
		
		public void gitGeri(int saat)
		{
			if (benzinMiktari < alacagiyol)
			{
				
				System.out.println("Yeterli benzin yok!");
				
			}

			else if (benzinMiktari > alacagiyol)
			{
				
				alacagiyol -= saat * hiz;
				
				azaltBenzinMiktari(alacagiyol);
				konumBelirleme(yol - alacagiyol);
				
			}
			
			
		}
		
		
		public void arttirHiz()
		{
			
			Random rd = new Random();
			int dizi [] = {2,3,5};
			int random = rd.nextInt(dizi.length);
			
			hiz *= dizi[random];
			
		}
		
		
		public void azaltHiz()
		{
			
			hiz = hiz / 2;
			
		}
		
		
		public void kontroletRadar()
		{
			
			if (hiz > 140)
			{
				System.out.println("Lütfen yavaşlayın!");
				mod = 1;
			}
			
			else if (100 < hiz && hiz > 140)
			{
				System.out.println("Hızınızı azaltınız.");
				
			}
			
			else if (hiz < 100 && hiz > 70)
			{
				
				System.out.println("Bravo.");
				
			}
				
		}
		
		
		public void silRenk()
		{
			
			if (mod == 0)
			{
				renk = "";
			}
			
			else 
			{
				
				System.out.println("Rengi silemezsiniz!");
				
			}
			
		}
		
		
		public void ataRenk()
		{
			Random rd = new Random();
			
			String [] renkler = {"Kırmızı", "Mavi", "Sarı", "Turuncu", "Siyah"};
			
			int random = rd.nextInt(renkler.length);
			
			renk = renkler[random];
			
		}
		
		
		public void gosterBilgi()
		{
			
			System.out.println(model);
			System.out.println(yas);
			System.out.println(renk);
			System.out.println(hiz);
			System.out.println(isRenkli);
			System.out.println(benzinMiktari);
			System.out.println(yol);
			System.out.println(konum);
			System.out.println(mod);
			

			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
}
