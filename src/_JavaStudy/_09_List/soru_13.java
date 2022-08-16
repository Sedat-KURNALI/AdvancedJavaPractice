package _JavaStudy._09_List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class soru_13 {
     /*
    Oncelikle icinde degerleri olan bir array i arraylist e cevirecek bir metod yaziniz.
    {"blau", "grun" ,"schwarz", "weiss", "gelb", "braun"}
    return tipi arrayList olacak
    main metod altinda metod ile gelen listeyi kullanarak HashSet, TreeSet ve linkedHashSet leri doldurun.
    */

    public static void main(String[] args) {

        String[] arr = {"blau", "grun", "schwarz", "weiss", "gelb", "braun"};

        ArrayList<String> ArrayList = new ArrayList<>();
        ArrayList = Cevir(arr);
        System.out.println("ArrayList = " + ArrayList);

        HashSet<String> hs = new HashSet<>(Cevir(arr));
        System.out.println("hs = " + hs);

        TreeSet<String> ts = new TreeSet<>(Cevir(arr));
        System.out.println("ts = " + ts);

        LinkedHashSet<String> lhs = new LinkedHashSet<>(Cevir(arr));
        System.out.println("lhs = " + lhs);


    }

    public static ArrayList<String> Cevir(String[] arr) {

        ArrayList<String> Arraylist = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            Arraylist.add(arr[i]);
        }

        return Arraylist;


    }


}
