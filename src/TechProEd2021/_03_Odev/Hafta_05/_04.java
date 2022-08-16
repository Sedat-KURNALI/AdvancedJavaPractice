package TechProEd2021._03_Odev.Hafta_05;

import java.util.Arrays;
import java.util.Scanner;

public class _04 {
    public static void main(String[] args) {
        /*
Get numbers from the user and output that number consecutive fibonacci number sequence
     	e.g : User enters 10
output : 0 1 1  2  3  5 8 13 21 34
F(n)=F(n-1)+F(n-2)
      	*/

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int sayi=scan.nextInt();
        int arr1[]= new int[sayi];
        arr1 [0]=0;
        arr1 [1]=1;
        for (int i = 2; i <sayi ; i++) {
            arr1[i] =arr1[i-1]+arr1[i-2];
        }
        System.out.println(Arrays.toString(arr1));



    }
}