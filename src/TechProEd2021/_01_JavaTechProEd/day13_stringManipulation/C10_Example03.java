 package TechProEd2021._01_JavaTechProEd.day13_stringManipulation;

import java.util.Scanner;

 public class C10_Example03 {
     public static void main(String[] args) {

                 /*

          Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin
          ve asagidaki gibi yazdirin
          isim-soyisim : M***** B*******
          kart no : **** **** **** 1234
          */


         Scanner scan=new Scanner(System.in);

         System.out.print("Lutfen isminizi giriniz");
         String isim=scan.next();

         System.out.print("Lutfen soyisminizi giriniz");
         String soyisim=scan.next();

         System.out.print("Lutfen kart numaranizi giriniz");
         String kartNo=scan.next();



         char isimIlkHarf = isim.toUpperCase().charAt(0);
         String isimGeriKalan = isim.substring(1).replaceAll("\\w", "*");
         String soyisimIlkHarf=soyisim.toUpperCase().substring(0, 1);
         String soyisimGeriyeKalan= soyisim.substring(1).replaceAll("\\w", "*");
         String kartNoBasi = "**** **** **** ";
         String kartNoSonu = kartNo.substring(kartNo.length() -4);


         System.out.println("isminiz ve soyisminiz : " +  isimIlkHarf + isimGeriKalan +" " +

                 soyisimIlkHarf + soyisimGeriyeKalan);

         System.out.println("Kart No : " + kartNoBasi + kartNoSonu);

         scan.close();
     }
 }
