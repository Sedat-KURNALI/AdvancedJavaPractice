package TechProEd2021._03_Odev.Hafta_03;

import java.util.Scanner;

public class _02
        /*
          Print "Lütfen iş unvanınızı girin”
          “jobTitle” isimli bir degisken olusturun ve kullanicidan isteyin.
          Doğru jobTitle yazdırmak için aşağıdaki test datalarini kullanın. Example :
          Eger jobTitle  qa ise print “İş unvanınız Quality Analyst”
          test data: qa ise print Quality Analyst
          dev ise print Developer
          ba ise print Business Analyst
          pm ise print Project Manager
       */
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iş ünvanınızı giriniz : ");
        String jobtitle = scan.nextLine().toLowerCase();

        if (jobtitle.equals("qa")) {
            System.out.println("iş ünvanınız Quality Analyst");
        } else if (jobtitle.equals("dev")) {
            System.out.println("iş ünvanınız Developer");
        } else if (jobtitle.equals("ba")) {
            System.out.println("iş ünvanınız Business Analyst");
        } else if (jobtitle.equals("pm")) {
            System.out.println("iş ünvanınız Project Manager");

        }
    }
}
