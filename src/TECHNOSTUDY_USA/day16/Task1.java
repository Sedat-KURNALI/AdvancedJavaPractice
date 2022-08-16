package TECHNOSTUDY_USA.day16;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] dizi = new int[5];
        dizi[0] = 0;
        dizi[1] = 1;
        dizi[2] = 2;
        dizi[3] = 3;
        dizi[4] = 4;

        // int sumArray = dizi[0]+dizi[1]+dizi[2]+dizi[3]+dizi[4];
        // System.out.println("Your array is:" + Arrays.toString(dizi));
        // System.out.println("Sum of your array values:" +sumArray);
        int sum = 0;
        for (int i = 0; i < dizi.length; i++) {
            sum += dizi[i];
        }
        System.out.println("Your array is: " + Arrays.toString(dizi));
        System.out.println("Sum of your array values: " + sum);
    }
}
