package TechProEd2021._01_JavaTechProEd.day13_stringManipulation;

import java.util.Scanner;

public class C8_Example01 {
    public static void main(String[] args) {

        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("4 harfli kelime giriniz");
        String str = scan.nextLine();

        if(str.length()!=4){
            System.out.println("lütfen 4 karakterli kelime giriniz");
        }else {
            System.out.print(str.substring(3));
            System.out.print(str.substring(2,3));
            System.out.print(str.substring(1,2));
            System.out.print(str.substring(0,1));

        }


        scan.close(); 


    }
}
