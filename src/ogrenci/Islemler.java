package ogrenci;

import java.util.Random;

public class Islemler {
	static Araba[] car = new Araba[30];
	static Kisiler[] k = new Kisiler[30];
	public static void plakaKontrol(String plaka)
	{
		boolean control=false;
		for(int i=0;i<30;i++)
		{
			if(plaka.equalsIgnoreCase(car[i].plaka))
			{
				System.out.println("Sisteme Kayitli Boyle Bir Plaka Vardir.");
				control = true;
			}
		}
		if(!control)
		{
			System.out.println("Sisteme Kayitli Boyle Bir Plaka Yoktur.");
		}
	}
	
	public static void arabaBilgilgierListele()
	{
		for(int i=0;i<30;i++)
		{
			System.out.println(car[i].kisiler.isim+" "+car[i].kisiler.cinsiyet+" "+car[i].kisiler.yas+" "+car[i].durumu+" "+car[i].marka+" "+car[i].plaka+" "+car[i].uretim_yili+" "+car[i].renk);
			
		}
	}
	
	public static void yuzdeHesapla()
	{
		int erkek=0,kadin=0;
		for(int i=0;i<30;i++)
		{
			if(car[i].kisiler.cinsiyet.equalsIgnoreCase("Erkek"))
			{
				erkek++;
			}
			else
			{
				kadin++;
			}
		}
		System.out.println("Erkek Kullanici Yuzdesi: "+String.valueOf((erkek/30)*100));
		System.out.println("kadin Kullanici Yuzdesi: "+String.valueOf((kadin/30)*100));
	}
	public static void arabaVerileriEkle()
	{
		String isimlerErkek[] = {"Mert","Can","Murat","Mehmet","Tarek","Mustafa","Ahmet","Ali","Naim"};
		String isimlerkadin[] = {"Meltem","Miray","Zeynep","Melike","Leyla","Yasmin","Yasemin","Lubna","Demet"};
		int yas[] = {18,19,20,35,34,54,23,13,25};
		
	
        for(int i=0;i<30;i++)
        {
                k[i] = new Kisiler();
        	Random rnd = new Random();
        	if(i%2==0)
        	{
        		
        		k[i].setCinsiyet("kadin");
        		int secim = rnd.nextInt(8);
        		k[i].setIsim(isimlerkadin[secim]);
        		secim = rnd.nextInt(8);
        		k[i].setYas(yas[secim]); 
        		
        		
        	}
        	else
        	{
        		k[i].cinsiyet="Erkek";
        		int secim = rnd.nextInt(8);
        		k[i].isim = isimlerErkek[secim];
        		secim = rnd.nextInt(8);
        		k[i].yas = yas[secim];
        	}
        }
        
        
        String markalar[] = {"Renault","Mercedes","Bmw","Fiat","Citroen","Honda","Hyundai"};
       
        String renkler[] = {"kirmizi","Siyah","Beyaz","Gri","Yesil","Mavi","Siyah"};
        for(int j = 0 ; j<30 ; j++)
        {
car[j] = new Araba();
        	Random rnd = new Random();
        	if(j%2==0)
        	{
        		car[j].durumu = "sifir";
        	}
        	else
        	{
        		car[j].durumu = "ikinci El";
        	}
        	int secim  = rnd.nextInt(7);
        	car[j].kisiler = k[j];
        	car[j].marka = markalar[secim];
        	secim = rnd.nextInt(81);
        	car[j].plaka = String.valueOf(secim)+" ABC "+String.valueOf(j);
        	secim = rnd.nextInt(7);
        	car[j].renk = renkler[secim];
        	secim = rnd.nextInt(7);
        	car[j].uretim_yili =String.valueOf(rnd.nextInt(2020)+2000);
        	
        
        }
		
		
		
	}

}