package _JavaStudy._11_Map;

import java.util.Scanner;
import java.util.TreeMap;

public class Soru_02 {

    //TODO TreeMap kullanarak bir cümlenin içindeki harflerin frekansını method ile bulunuz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Cümle giriniz :");
        String cumle = scan.nextLine().toLowerCase();

        frekans(cumle);

        //java çalıştıkça gelişen bir dildir: j=1, a=4, ç=2 ....

    }

    private static void frekans(String cumle) {

        TreeMap<Character, Integer> fr = new TreeMap<>();//KONTEYNIRIMIZ, char ve ınt olarak java değerlendirir

        for (int i = 0; i < cumle.length(); i++) {

            if (fr.containsKey(cumle.charAt(i))) {//girilen cumlenin ilk harfini alır buraya bakar ilk olduğu için else ye gider, her biri için böyle çalışır
                fr.replace(cumle.charAt(i), fr.get(cumle.charAt(i)) + 1);//virgülün ilk kısmı character kısmı, ikinci kısıım map in ınteger kısmı

            } else {
                fr.put(cumle.charAt(i), 1);//harf ilk olduğu için ona 1 değeri atar, birden fazla ise if kısmı zaten devreye girecek, buraya gelmeyecek
            }

        }
        System.out.println(fr);
    }
}
