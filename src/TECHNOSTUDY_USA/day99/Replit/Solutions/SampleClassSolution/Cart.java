package TECHNOSTUDY_USA.day99.Replit.Solutions.SampleClassSolution;

import java.util.LinkedHashMap;

public class Cart {
    //instance variables
    String userName; //POINTER
    LinkedHashMap<String , String> LMap; //LMap isminde bir map olusturacaksin tanimlamasi POINTER RAME POINT
    // LMap = new LinkedHashMap<>(); tanimlanan LMap objesini create ediyorum Bu satir RAM de LMAP isminde bir map create ediyor.
    public void addItem (String str1, String str2){
        LMap.put(str1,str2);
    }

    public double getPrice (){
        Total tot =new Total();
            double price = tot.getTotal(LMap);
            return price;
    }

    public String toString (){
        return "\nUser name is : "+userName+
                "\nAll elements are : "+LMap+
                "\nTotal price : "+getPrice();
    }

    /*

    Create method named as getPrice <<<OK>>>
Return type is ??? void ??? and Parameter is Total class  ???? // void yerine double
Call getTotal method from Total class. <<<OK>>>
------------------------------------------
Create a toString method and print the datas in order such as: <<<OK>>>
 User name is : Your Object username <<<OK>>>
 All elements are : All the key and values in the linkedHashmap <<<OK>>>
 Total price : Total Price of all the values <<<OK>>>
    ----------------------
    Class Cart { 2nd Class
Create instance variables as: <<<OK>>>
1. String userName <<<OK>>>
2. LinkedHashMap<String , String> LMap <<<OK>>>
Create method named as addItem <<<OK>>>
Return type is void and parameters are String str1, String str2 <<<OK>>>
Add str1 as key to LMap  and add str2 as value to LMap <<<OK>>>
-------------------------------------------------------------------------------

}
     */


}
