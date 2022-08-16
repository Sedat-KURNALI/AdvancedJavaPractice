package _JavaStudy._11_Map._01_HashmapMethods;

import java.util.HashMap;

public class Hashmap_1 {
    public static void main(String[] args) {

     //todo       Hashmap Mantığı
        // Map bir interface'dir. Map interface'inin 3 tane child class'i vardir
        /* 1) HashMap: HasMap key-value yapisini kullanir. Key ve value
         *             programci tarafindan yazilir.
         *             Key ve value'da null degeri kullanilabilir. Key'de
         *             1'den fazla null degeri kullanilirsa Java son kullanilan
         *             null'i kabul eder. Value'da 1'den fazla null degeri
         *             kullanilabilir.
         *             HashMap console'a yazdirildiginda hem key degerleri hem de
         *             value degerleri aralarina = sembolu konularak yazdirilir
         *             HashMap'ler ekrana yazdirirken rastgele siralama yapar
         *             HasMap map'ler arasinda en hizlisidir.
         *             HashMap'ler "thread safe" degildir.
         */
        HashMap<String, String> map = new HashMap<>();
        //   KEY           VALUE
        map.put("Amazon", "296 Euro");
        map.put(null, "200 Euro");//null key kabul eder
        map.put("TeknoSA", null);//null value kabul eder
        map.put("Ebay", "278 Euro");
        map.put("Saturn", "300 Euro");
        map.put("Mediamarkt", "310 Euro");
        map.put("Apple Store", "340 Euro");
        map.put("Apple Store", "300 Euro");//"Apple Store" anahtarındaki değer "300 Euro" olarak güncellendi.
                                           // Ayni key kullanildiginda ustune yazar.

        System.out.println(map);


    }
}
