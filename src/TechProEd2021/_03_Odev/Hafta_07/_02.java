package TechProEd2021._03_Odev.Hafta_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {
         /*  Rastgele kullanıcı adı oluşturan JAVA kodu yazınız.
	      *  1. Adım : Kullanıcıdan ismini isteyelim
	      *  2. Adım : Kullanıcı adındaki boşlukları silelim.
	      *  3. Adım : Kullanıcı adının alınabilir olup olmadığına bakalım.
	      *  4. Adım : Eğer bizim listemizde öyle bir kullanıcı adı yoksa kullanıcı adı, kullanıcının girdiği isim olsun.
	      *  5. Adım : Eğer bu kullanıcı adı zaten varsa, sonuna rastgele sayı oluşturup ekleyelim, ve gösterelim.
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ayşe");
		veritabanindakiKullaniciListesi.add("Süleyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
	 */
        List<String> kullaniciListesi = new ArrayList<>(Arrays.asList("Mehmet","Ebubekir","Alican","Süleyman"));

        System.out.println(kullaniciListesi);

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz :");
        String name = scan.nextLine();

        name = name.replaceAll(" ", "").substring(0, 1).toUpperCase().concat(name.substring(1).toLowerCase());
        String kullaniciIsmi = "";
        if (!kullaniciListesi.contains(name))
            kullaniciIsmi = name;
        else kullaniciIsmi = name + " 1234 ";
        System.out.println(kullaniciIsmi);
    }
}
