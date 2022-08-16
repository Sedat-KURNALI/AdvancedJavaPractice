package TECHNOSTUDY_USA.day99.Replit.ReplitClass.ClassObjects3;

import java.util.LinkedHashMap;

public class Total {

    public double StringToDouble(String str){
        double doublE = Double.parseDouble(str.replace("$", "").trim());
        return doublE;
    }

    public double getTotal (LinkedHashMap<String,String> map){
       double sum = 0;
    for (String value : map.values()) {
            sum += StringToDouble(value);
        }
        return sum;
    }
}
/*
Class Total {
<<<OK>>> 2. Create method named as getTotal <<<OK>>>
Parameter is LinkedHashMap<String,String> and Return type is double. <<<OK>>>
By using the method StringToDouble: <<<OK>>>
 a. change values in the LinkedHashMap<String,String> into double values, <<<OK>>>
 b. sum all the double values and return the total. <<<OK>>>
 <<<OK>>> 1. Create method named as StringToDouble. <<<OK>>>
Parameter is a String and Return type is double. <<<OK>>>
Remove the $ in the String, then change it to double. <<<OK>>>
Return the double. <<<OK>>>
}
 */