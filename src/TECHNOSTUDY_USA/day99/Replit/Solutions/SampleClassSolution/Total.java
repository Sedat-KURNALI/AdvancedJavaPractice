package TECHNOSTUDY_USA.day99.Replit.Solutions.SampleClassSolution;

import java.util.LinkedHashMap;

public class Total {

    public double stringToDouble (String str){

        double result= Double.parseDouble(str.replace("$", "").trim());

        return result;
    }

    public double getTotal (LinkedHashMap<String,String> map){ //(key,value)

        double sum = 0;
        for (String value : map.values()) {
           sum += stringToDouble(value);
        }
        return sum;
    }
}

/*
    Class Total {  // 1st Class
<<<OK>>> 1. Create method named as StringToDouble. 1<<<OK>>>                                    <<<OK>>>
Parameter is a String and Return type is double. 2<<<OK>>>
Remove the $ in the String  <<<OK>>>, then change it to double. 3 <<<OK>>>
Return the double. 4 <<<OK>>>
-------------------------------------------------------------------------
<<<OK>>> 2. Create method named as getTotal <<<OK>>>
Parameter is LinkedHashMap<String,String> and Return type is double. <<<OK>>>
By using the method StringToDouble: <<<OK>>>
 a. change values in the LinkedHashMap<String,String> into double values, <<<OK>>>
 b. sum all the double values and return the total. <<<OK>>>
}
     */