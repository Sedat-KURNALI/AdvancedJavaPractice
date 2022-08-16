package _JavaStudy._05_ForLoop.Cozumler;

public class Soru_10 {
    public static void main(String[] args) {


// 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

        for (int i = 0; i <= 255; i++) {
            char harf = (char) i;

            System.out.println(i + " - " + harf);
        }


    }
}


