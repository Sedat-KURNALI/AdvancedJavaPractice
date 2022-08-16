package _JavaStudy._09_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Soru_07 {

    public static void main(String[] args) {
        /*
         * Task: Beş elemanli bir String list olusturup asagidaki islemleri yapin

         * Isimler : {hakan,reha,ahsen,ipek,haluk}

         * -) hakan yerine ahmet ekleyiniz.
         * -) 3. index’e zehra’yı ekleyiniz.
         * -) haluk'u listeden siliniz.
         * -) cemal'i 'u listeye ekleyiniz.
         * -) List’in buyuklugunu bulunuz.
         * -) Alfabetik siraya koyunuz,
         * -) List’in elemanlarinin tamamini siliniz.
         */

        // 2 yolla list olusturabiliriz

        List<String> list = new ArrayList<>();
        list.add("hakan");
        list.add("reha");
        list.add("ahsen");
        list.add("ipek");
        list.add("haluk");
        System.out.println(list);

        // array olusturup sonradan liste cevirebiliriz
        String arr[]={"hakan","reha","ahsen","ipek","haluk"};
        List<String> list2= Arrays.asList(arr);

        System.out.println(list2);

        //hakan yerine ahmet ekleyiniz.

        list.remove("hakan");
        System.out.println(list);
        list.add(0, "ahmet");
        System.out.println(list);
        //3. index’e zehra’yı ekleyiniz.
        list.add(2, "zehra");
        System.out.println(list);

        //cemal'i listeye ekleyiniz.
        list.add("cemal");
        System.out.println(list);
        //Alfabetik siraya koyunuz,

        Collections.sort(list);
        System.out.println(list);
        //List’in buyuklugunu bulunuz.
        System.out.println(list.size());

        //List’in elemanlarinin tamamini siliniz.
        list.removeAll(list);
        System.out.println(list);

    }


}
