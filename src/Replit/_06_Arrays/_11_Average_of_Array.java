package Replit._06_Arrays;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */

        //Kodu aşağıya yazınız.

        int[] arr = {12, 14, 21, 23, 10, 4};

        int sum = 0;
        int ort = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        ort = sum / arr.length;
        System.out.println(ort);
    }
}