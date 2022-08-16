package MENTORING._12_ArrayList_Collections;

import java.util.ArrayList;
import java.util.Collections;

public class _01_Collections_Methods {


    public static void main(String[] args) {

          ArrayList<Integer> intlist=new ArrayList<>();

          intlist.add(11);
          intlist.add(88);
          intlist.add(88);
          intlist.add(33);


        System.out.println(intlist);



        System.out.println("*********************      SIRALAMA   ******************************");

        Collections.sort(intlist);
        System.out.println("sirali = "+ intlist);



        System.out.println("*********************      MAX -MİN   ******************************");

        System.out.println("Max sayi = "+ Collections.max(intlist));
        System.out.println("Min sayi = "+ Collections.min(intlist));




        System.out.println("*********************      LİSTEYİ TERS ÇEVİRME   ******************************");

        Collections.reverse(intlist);
        System.out.println("tersten yaz = "+ intlist);



        System.out.println("*********************     BÜTÜN ELEMANLARA BIR DEGER ATAMA fill() ******************************");

             Collections.fill(intlist,1);
             System.out.println(" fill methodu " + intlist);


        System.out.println("*********************     replaceAll  ******************************");

        Collections.replaceAll(intlist,88,5);

        System.out.println(intlist);

    }


}
