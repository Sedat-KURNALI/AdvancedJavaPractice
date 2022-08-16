package TECHNOSTUDY_USA.example;

import java.util.Arrays;

public class SortArray_withoutSort {

    //Return an array that contains the exact same numbers as the given array,
    // but rearranged so that all the zeros are grouped at the start of the array.
    // The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}.
    // You may modify and return the given array or make a new array.

    //Create an array as 1,0,0,1,0

    //result should be 0,0,0,1,1
    public static void main(String[] args) {
        int [] numbers={2,0,0,1,0};
        int [] newarray= new int [numbers.length];

        for(int i=0; i<numbers.length;i++){
            if (numbers[i] == 0 ){
                newarray[i]=numbers[i];

            }else {
                newarray[newarray.length - 1] = numbers[i];
            }
        }
            System.out.println(Arrays.toString(newarray));
    }
}
