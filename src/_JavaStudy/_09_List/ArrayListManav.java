package _JavaStudy._09_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListManav {
	static List<String> urunListesi =new ArrayList<>();
	static List<Float> urunFiyatlari =new ArrayList<>();
	static float toplanOdenecekTutar;

	public static void main(String[] args) {
		/*
		 * Basit bir 5 ürünlü manav alisveris programi yaziniz.
		 *
		 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
		 * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
		 * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
		 * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
		 * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
		 * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
		 *
		 * */

		urunListesi.add("Domates - Urun Kodu :0");
		urunListesi.add("Biber - Urun Kodu :1");
		urunListesi.add("Erik - Urun Kodu :2");
		urunListesi.add("Karpuz - Urun Kodu :3");
		urunListesi.add("Havuc - Urun Kodu :4");

		urunFiyatlari.add(2.0f);
		urunFiyatlari.add(3.0f);
		urunFiyatlari.add(10.0f);
		urunFiyatlari.add(5.0f);
		urunFiyatlari.add(3.0f);
		System.out.println(urunListesi.toString());//String e çevirip yaz
		musteriSecim();


	}
	public static void musteriSecim() {
		Scanner scan = new Scanner(System.in);//
		System.out.println("Hangi urunu secmek istersiniz?");
		int secim =scan.nextInt();//
		System.out.println("Kac kilo almak istersiniz?");
		float kilo =scan.nextFloat();
		float urunFiyati = urunFiyatlari.get(secim);
		float toplamUrunFiyati=kilo*urunFiyati;
		toplanOdenecekTutar+=toplamUrunFiyati;

		System.out.println("Sectiginiz urun: " + urunListesi.get(secim));
		System.out.println("Urun Fiyati: " +toplamUrunFiyati);

		System.out.println("Alisverise devam etmek isterseniz 1, kasaya gitmek icin 2 yaz�n�z");
		int karar = scan.nextInt();
		if(karar==1) {
			musteriSecim();
		}else {
			kasa();
		}
	}
	public static void kasa() {
		System.out.println("Toplam odenecek tutar: " + toplanOdenecekTutar);

	}
}
