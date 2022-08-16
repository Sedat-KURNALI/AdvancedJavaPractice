package _JavaStudy._10_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Soru_01 {
     /*
    İcinde degerleri olan bir array i arraylist e cevirecek bir metod yaziniz.
    {"reha", "hakan", "haluk", "ipek", "ahsen"}
    return tipi arrayList olacak
    main metod altinda metod ile gelen listeyi kullanarak HashSet, TreeSet ve linkedHashSet leri doldurun.
    */

    public static void main(String[] args) {

        String[] arr = {"reha", "hakan", "haluk", "ipek", "ahsen"};

        ArrayList<String> list = new ArrayList<>();
        list = Cevir(arr);
        System.out.println("ArrayList = " + list);

        HashSet<String> hs = new HashSet<>(Cevir(arr));
        System.out.println("hs = " + hs);

        TreeSet<String> ts = new TreeSet<>(Cevir(arr));
        System.out.println("ts = " + ts);

        LinkedHashSet<String> lhs = new LinkedHashSet<>(Cevir(arr));
        System.out.println("lhs = " + lhs);
    }

    public static ArrayList<String> Cevir(String[] arr) {

        ArrayList<String> ArrayList = new ArrayList<>();

        for (String str : arr) {
            ArrayList.add(str);
        }
        return ArrayList;
    }
}
