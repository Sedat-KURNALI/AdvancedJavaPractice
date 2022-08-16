package JavaCybertekSchool_2020.group12.practice1;

import java.util.ArrayList;
import java.util.Arrays;

public class debugging {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3));
        double avg = findAverage(arr);
        System.out.println(avg);

    }

    private static  int findAverage(ArrayList<Integer>arr) {
        int average =0;
        for(Integer each:arr){
            average+=each/arr.size();
        }
        return average;
    }
}

