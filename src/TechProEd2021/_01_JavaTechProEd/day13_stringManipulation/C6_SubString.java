package TechProEd2021._01_JavaTechProEd.day13_stringManipulation;

public class C6_SubString {
    public static void main(String[] args) {

        String str= "Her ders Java gibi olsa";  // lenght:23

        System.out.println(str.substring(10)); // 10 cu idex dahil(inclusive) sonuna kadar tüm string
        System.out.println(str.substring(str.length()-10)); // son 10 harfı yazdırın

        // ilk 10 karekteri alma
        System.out.println(str.substring(0,9)); // subString(0,10) yazıldığında
                                                //0 inclusive(dahil), 10 exclusive(dahil değil)
        //11 inci karekterden sonuna kadar olan String yazdıralım
        System.out.println(str.substring(10));

        // str'in ilk on karekteri * ile gizleyin, geriye kalanlar normal yazılsın

        System.out.println("**********" + str.substring(10));
        System.out.println(str.substring(0,10).replace("\\D","*" + str.substring(10)));

        System.out.println(str.substring(10,10));  // 10. index dekini al,10.index dekini alma der
                                                    // JAVA son söyleneni yapar yani birsey yazdırmaz
       // System.out.println(str.substring(8,7)); // RTE


        System.out.println(str.substring(22));  //length()-1 -> son karakter
        System.out.println(str.substring(23));  // length() BO�?-> birşey vermez
        System.out.println(str.substring(23));  //length()'den büyük sayı yazasak RTE

      // ikinci bir çözüm

     //  str'in ilk on karekteri * ile gizleyin, geriye kalanlar normal yazılsın

        String str3 = str.substring(0,10); // str nin ilk 10 karakterini aldık
        str3=str3.replaceAll("\\W", "a");
        System.out.println(str3.replaceAll("\\w", "*")+str.substring(10)); // **********ava gibi olsa




    }
}
