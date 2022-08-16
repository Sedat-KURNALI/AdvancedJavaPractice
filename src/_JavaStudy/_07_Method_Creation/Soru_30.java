package _JavaStudy._07_Method_Creation;

import java.util.Scanner;

public class Soru_30 {
    /*
             SORU :3
             Kullanicidan 100 den kucuk bir tamsayi isteyip, bu sayinin daha
             onceden tanimlanmis array'de olup olmadigini kullaniciya donen bir method
             yaziniz

             Array={3,5,21,32,34,45,56,57,76,87,95}

             Input : 5  Output: Girdiginiz sayi Arrayde var
             Input : 15 Output: Girdiginiz sayi Arrayde yok
             */
    public static void main(String[] args) {
        int arr[] = {3, 5, 21, 32, 34, 45, 56, 57, 76, 87, 95};
        if (arrayKontrol(arr))
            System.out.println("Girdiğiniz eleman Array de var");
        else System.out.println("Girdiğiniz eleman Array de yok");
    }

    public static boolean arrayKontrol(int[] arr) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Arrayde olup olmadigini kontrol etmek icin bir sayi giriniz :");
        int sayi = scan.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (sayi == arr[i]) {
                flag = true;
            }
        }
        return flag;
    }
}

