package TechProEd2021._01_JavaTechProEd.day13_stringManipulation;

import java.util.Scanner;

public class C2_EndsWith {
    public static void main(String[] args) {


        String str= "Java' yla hayat ne g�zel";
        System.out.println(str.endsWith("zel")); //true
        System.out.println(str.endsWith("ne g�zel")); // true
        System.out.println(str.endsWith("zel ")); // false

        // Kullanicidan bir email isteyin
        // eger @ isareti ivecermiyorsa "girdiginiz bilgi email degil"
        // eger @ isareti iceriyor ama @gmail.com icermiyorsa "lutfen gmail adresi yazin"
        // eger ilk iki sarti sagliyor ama @gmail.com ile bitmiyorsa "gecersiz gmail adresi" yazsin

        Scanner scan = new Scanner(System.in);
        System.out.println("l�tfen email inizi giriniz");
        String email = scan.next();

        if (!email.contains("@")){ // başında ! olunca -> email @ içermiyorsa
            System.out.println("girdiginiz bilgi email degil");
        }else if(!email.contains("@gmail.com")){ //
            System.out.println("lutfen gmail adresi yazin");
        }else if(!email.endsWith("@gmail.com") ){
            System.out.println("emai iniz ba�ar�yla kaydedildi");
        }else {
            System.out.println("ge�ersiz gmail adresi");
        }
        scan.close();

    }
}
