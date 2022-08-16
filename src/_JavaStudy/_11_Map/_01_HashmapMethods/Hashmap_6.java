package _JavaStudy._11_Map._01_HashmapMethods;

import java.util.HashMap;

public class Hashmap_6 {
    public static void main(String[] args) {

//todo            Hashmap .containsValue

        HashMap<String, String> map = new HashMap<>();

        map.put("Amazon", "296 Euro");
        map.put("Ebay", "301 Euro");
        map.put("Saturn", "326 Euro");
        map.put("MediaMarkt", "340 Euro");
        map.put("Apple Store", "320 Euro");

        String v = "301 Euro";
        if (map.containsValue(v)) {
            System.out.println("Bu fiyatta bir satıcı bulundu.");
        } else {
            System.out.println("Bu fiyatta bir satıcı bulunamadı..");
        }
        System.out.println("296 Euro'ya Ipad var mı?" + map.containsValue("296 Euro"));
    }
}
