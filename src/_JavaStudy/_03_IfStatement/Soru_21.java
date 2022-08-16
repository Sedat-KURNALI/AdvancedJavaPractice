package _JavaStudy._03_IfStatement;

import java.util.Scanner;

public class Soru_21 {

    public static void main(String[] args) {

        /*
        Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle.

        Eger ilk kelimenin son harfi, ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini kaldırın

        Örnek:      "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen birinci kelimeyi giriniz : ");
        String word1 = sc.nextLine().toLowerCase();

        System.out.println("lütfen ikinci kelimeyi giriniz : ");
        String word2 = sc.nextLine().toLowerCase();

        if (word1.charAt(word1.length() - 1) == word2.charAt(0)) {
            System.out.println(word1 + word2.substring(1));

        } else System.out.println(word1 + word2);
    }
}
