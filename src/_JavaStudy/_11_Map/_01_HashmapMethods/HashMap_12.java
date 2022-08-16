package _JavaStudy._11_Map._01_HashmapMethods;

import java.util.HashMap;

public class HashMap_12 {

    public static void main(String[] args) {

         HashMap<String,String> map = new HashMap<>();

         //             Key            Value
           map.put("Amazon",        "296 Euro");
           map.put("Ebay",          "278 Euro");
           map.put("Saturn",        "300 Euro");
           map.put("Mediamarkt",    "310 Euro");
           map.put("Apple Store",   "340 Euro");
           map.put("TeknoSa",       "340 Euro");

        System.out.println(map);

        //todo  ******************** Hashmap .replace() methodu *************************
        map.replace("Amazon","277 Euro");
        System.out.println("map replace :" + map);

        //todo  ******************** Hashmap .remove() methodu *************************

        System.out.println("map remove :" + map.remove("TeknoSa",       "340 Euro"));//True
        System.out.println("map remove :" + map.remove("TeknoSa",       "300 Euro"));//false
        System.out.println("map remove :" + map.remove("TeknoSa"));//null
        System.out.println("map remove :" + map.remove("340 Euro"));//null key e göre siler value ye göre değil
        System.out.println("map remove :" + map);//silinmiş halini verir.
        System.out.println("map remove :" + map.remove("haluk",       "çok milyon Euro"));//false verir. ama olmayan bir key silinmek istendiği için map değişmez.

      //todo  ******************** Hashmap .size() methodu *************************

        System.out.println("map size :" + map.size());

        //todo  ******************** Hashmap .getOrDefault() methodu *************************

        System.out.println("map Reha getOrDefault :" + map.getOrDefault("Reha","haluk")); // "Reha" key olmadığı için bu key'e default olarak "haluk" değerini atar.
        System.out.println("map Ebay getOrDefault :" + map.getOrDefault("Ebay","haluk"));// "Ebay" key olduğu için bu key'e default değer değil var olan değerini getirir.

        //todo  ******************** Hashmap .putIfAbsent() methodu *************************

        System.out.println("map putIfAbsent :" + map.putIfAbsent("Ebay","haluk"));
    // Burada "haluk"'u "Ebay" key'ine eklemez cunku "Ebay"'de value vardir. putIfAbsent() method'u key de value yoksa ekler.

     //todo  *****************  Hashmap kopyalama yolları  ***********************

           HashMap<String,String> map2=new HashMap<>();
//           map2=new HashMap<>(map);
//        System.out.println("map2 : "+ map2);

        map2.putAll(map);
        System.out.println("map2 : "+ map2);



        //todo    **************** Hashmap boşaltma .clear **************************

//                map.clear();
//        System.out.println("clear dan sonra : "+ map);
//
//        System.out.println(map.isEmpty());



        //todo ******************* Hashmap .containsKey *****************************

              String magza= "Saturn1";

              if (map.containsKey(magza))
              {

                  System.out.println("deger" + map.get(magza));

              }else
              {
                  System.out.println("bu mapte boyle bir magza yoktur");

              }

        System.out.println(map.containsKey("Saturn1"));

        //todo ******************* Hashmap .containsValue *****************************


        String fiyat = "310 Euro";

        if (map.containsValue(fiyat)){

            System.out.println("bu fiyatta bir satici bulundu");

        }else
        {

            System.out.println("bu fiyatta bir satici bulunamadi");
        }

        System.out.println(map.containsValue("310 Euro"));



        //todo ******************* Hashmap .get  Spesifik bir Key'i elde etmemize yarıyor *****************************

        System.out.println(map.get("Saturn"));




      //todo *******************  Hashmap Keys ve Values yazdırma.  *****************************

        System.out.println(map.keySet());
        System.out.println(map.values());




    }




}
