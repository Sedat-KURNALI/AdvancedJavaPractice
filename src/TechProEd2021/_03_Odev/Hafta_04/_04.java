package TechProEd2021._03_Odev.Hafta_04;

import java.util.Scanner;

public class _04     {

     /*
    name1 ve name2 degiskenlerini olusturun.
    name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
    name1 degiskeninin karakter sayisi tek ise “name1 cift sayili olmadigi icin ortasina yerlestiremedik” yazdirin.
          e.g:
          name1= mehmet
         name2= ahmet
         Print ==> mehahmetmet
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen  bir kelime giriniz : ");
        String name1=scan.nextLine();

        System.out.print("Lütfen ikinci bir kelime giriniz : ");
        String name2=scan.nextLine();

        if (name1.length()%2==0) {
            System.out.println(name1.substring(0,name1.length()/2).
                    concat(name2).concat(name1.substring(name1.length()/2)));
        }
        else System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");
    }
}
