package _JavaStudy._02_StringManipulation;

import java.util.Scanner;

public class Soru31 {
    public static void main(String[] args) {
		/*
		Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
		e.g:
		char ch1= 'a' ;
		String name ="John came late"
		=> Tekrar Sayisi = 2

 	//1.yol
	 Scanner scan=new Scanner(System.in);
	 System.out.print("lutfen bir isim giriniz :");
	 String isim= scan.nextLine().toLowerCase();
	 System.out.print("Lutfen saymak istediginiz harfi giriniz :");
     String harf= scan.next().substring(0, 1);

     int count=0;
     int index=0;
     while(index<isim.length()) {
    	 if (isim.substring(index, index+1).equals(harf)) {
             count++;
         }

         index++;
     }
     System.out.print(harf + " harfinin tekrar sayisi :" +  count );

      scan.close();
      	*/
        //2.yol

        Scanner scan1=new Scanner(System.in);
        System.out.print("Lutfen bir isim giriniz :");
        String isim1=scan1.nextLine();
        System.out.print("Lutfen bir karakter giriniz :");
        char karakter1=scan1.next().charAt(0);

        int count1=0;
        for (int i = 0; i <isim1.length() ; i++) {
            if (isim1.charAt(i)==karakter1) {
                count1++;
            }
        }
        System.out.print("Tekrar Sayisi :" +count1);

        scan1.close();

    }
}
