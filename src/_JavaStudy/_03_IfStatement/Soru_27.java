package _JavaStudy._03_IfStatement;

import java.util.Scanner;

public class Soru_27 {
    public static void main(String[] args) {
        //// Kullanıcıdan aldığınız korrdinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("x değeri =");
        int x = oku.nextInt();

        System.out.println("y değeri =");
        int y = oku.nextInt();

        if (x > 0 && y > 0)
            System.out.println("A bölgesinde");
        else if (x < 0 && y < 0)
            System.out.println("C bölgesinde");
        else if (x < 0 && y > 0)
            System.out.println("B bölgesinde");
        else if (x > 0 && y < 0)
            System.out.println("D bölgesinde");
        else
            System.out.println("Eksen üzerinde");
    }
}
