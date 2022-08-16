package TECHNOSTUDY_ISMETBY.Gun39JavaEnum.Example;

import java.util.ArrayList;

public class Ex1 {
    static final String name = "Maximilian";

    static final ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {


        System.out.println("Replace = " + name.replace("i", "0"));
        System.out.println("1.name = " + name);

        // name =name.replace("i","0");
        //System.out.HuseyinBYCalısma.println("2.name = " + name);

        // bu değişikliği ilk name e atama yaparsak ilk name değişir.
        // yukarıdaki String i final yaparsak değişikliği name e atayamayız.
        // çünkü final olduğu için değişmez.


        list.add("Ahmet");
        list.add("Ali");
        System.out.println(" önce list.toString = " + list.toString());
        // list=new ArrayList<>(); //final yazılırsa yeniden oluşturmaya (new) izin vermiyor. diğer işlemler ekleme vs yapılabilir,
        //System.out.HuseyinBYCalısma.println(" sonra list.toString = " + list.toString());
    }

    // Static bir metodun içinde metodun dışından kullanacağınız her şey static veya
    // new ile yeni oluşturulmuş olmalı.Sebebi: Static bir canlı bir yapı
    // olduğundan içind ekullanılanlarda o anda erişilebilir canlı yani
    // static olomalı.
}
