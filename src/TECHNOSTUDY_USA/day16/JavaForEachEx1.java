package TECHNOSTUDY_USA.day16;

import java.util.Arrays;

public class JavaForEachEx1 {

    public static void main(String[] args) {
        String[] names = new String[5];
        System.out.println("names: "+ Arrays.toString( names ) );

        int[]numbers = new int[5];
        System.out.println("numbers: "+ Arrays.toString( numbers ) );

        for (int num : numbers) {
            System.out.println(num);
            //   syntax
            //   for(data_type variable:array){
            //   body of the loop
        }

    }
}
