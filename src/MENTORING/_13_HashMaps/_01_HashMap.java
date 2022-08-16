package MENTORING._13_HashMaps;

import java.util.HashMap;

public class _01_HashMap {

    public static void main(String[] args) {

         HashMap<String,String> map = new HashMap<>();

         //             Key            Value
           map.put("Amazon",        "296 Euro");
           map.put("Ebay",          "278 Euro");
           map.put("Saturn",        "300 Euro");
           map.put("Mediamarkt",    "310 Euro");
           map.put("Apple Store",   "340 Euro");

        System.out.println(map);



      //todo  ******************** Hashmap .size() methodu *************************

        System.out.println("map size :" + map.size());

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
