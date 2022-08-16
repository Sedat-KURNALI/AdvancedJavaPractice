package TECHNOSTUDY_USA.example;

import java.util.HashMap;

public class JavaSetListMapsForEachMethod {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "10");
        map.put(2, "20");
        map.put(3, "30");
        map.put(4, "40");
        map.put(5, "50");

        for (Integer keys : map.keySet() ) {
            map.compute (keys,(key,value) -> '$'+value); // 98,03
        }


        System.out.println(map);
        /*
        System.out.println(map);

        map.compute (1,(key,value) -> value += 1000);
        map.computeIfAbsent(6,(key) -> 600);

        System.out.println(map);

        map.forEach((key,value)-> System.out.println("Value: " + value + " "+ "Key: " + key)); //->lambda
        map.forEach((key,value)-> System.out.println(value*key));
*/
    }
}
