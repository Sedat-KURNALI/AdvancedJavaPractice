package TECHNOSTUDY_USA.day99.Replit.ReplitClass.ClassObjects3;

import java.util.LinkedHashMap;

public class Cart {
    String userName;
    LinkedHashMap<String, String> LMap = new LinkedHashMap<>();


    public void addItem(String str1, String str2) {
        LMap.put(str1, str2);
    }

    public double getPrice() {
        Total t = new Total();
        double price = t.getTotal(LMap);
        return price;
    }

    public String toString() {
        return "\nUser name is : " + userName +
                "\nAll elements are : " + LMap +
                "\nTotal price : " + getPrice();


    }
}
/*
Class Cart {


Create a toString method and print the datas in order such as:
 User name is : Your Object username
 All elements are : All the key and values in the linkedHashmap
 Total price : Total Price of all the values
--------------
Create instance variables as: <<<OK>>>
1. String userName <<<OK>>>
2. LinkedHashMap<String , String> LMap <<<OK>>>
Create method named as addItem <<<OK>>>
Return type is void and parameters are String str1, String str2 <<<OK>>>
Add str1 as key to LMap  and add str2 as value to LMap <<<OK>>>
--------------------------
Create method named as getPrice  <<<OK>>>
Return type is *** void *** and Parameter is Total class <<<OK>>>
Call getTotal method from Total class. <<<OK>>>
}

 */
