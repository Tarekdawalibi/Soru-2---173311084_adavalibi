package ogrenci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
         Islemler.arabaVerileriEkle();
         try (Scanner scn = new Scanner (System.in)) {
			System.out.print("Plaka Giriniz: ");
			 String plaka = scn.next();
			 Islemler.plakaKontrol(plaka);
		}
         Islemler.yuzdeHesapla();
         Islemler.arabaBilgilgierListele();
         
         
	}

	    

}