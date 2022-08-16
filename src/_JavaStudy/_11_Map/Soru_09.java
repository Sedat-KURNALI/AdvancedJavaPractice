package _JavaStudy._11_Map;

import java.util.HashMap;

public class Soru_09 {
    // Ad ve soyad bulunduruan iki ayrı array'i bir map' eklaeyip yazdırınız.
   // input : {"ahmet", "ahmet can", "haluk"};  {"şeref", "erdem", "bilgin"};
    //
    public static void main(String[] args) {
        String[] firstNames = {"ahmet", "ahmet can", "haluk"};
        String[] lastNames = {"şeref", "erdem", "bilgin"};
        //write you code here

        HashMap<String, String> map = new HashMap<>();

//        for (int i = 0; i < firstNames.length; i++) {
//            map.put(firstNames[i], lastNames[i]);
//        }

        for (String st : firstNames){

            for (String str : lastNames){
                map.put(st, str);
            }
        }
        System.out.println(map);


        //end of you code
        //System.out.println(map);
        //output:
        //{Max=Smith,Drake=Jones,Susan=Miller}
    }
}
