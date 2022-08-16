package TECHNOSTUDY_USA.day99.Replit.ReplitMethod;

import java.util.ArrayList;

    public class ReplitMethod5 {
        /*
        Create one method name is getSum ***
        This method has one parameter which is String ArrayList ***
        Remove all the $ signs in the arraylist and sum all the numbers ***
        return the total return type should be int ***
        if the result less then 0 then print -1 ***
        Example :
        ArrayList is : $13 , $15 , $20
        result should be 48
        Example 2:
        ArrayList is : $-13 , $0 , $0
        result should be -1
        Note: add the imports if need to.
         */

    public static int getSum (ArrayList<String> list){

        int result = 0;
        int sum = 0;
        //String elementAtIndex2 = names.get(2);
        String [] str = new String[list.size()];
        int [] arrNum = new int [list.size()];

        for (int i = 0; i < list.size(); i++) {
             str[i] = list.get(i).replace("$", "");
                arrNum[i] = Integer.valueOf(str[i]);
                sum += arrNum[i]; // sum = sum + arrNum[i];
        }
        if (sum >= 0){
            result = sum;
            return result;
        }else {
            result = -1;
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("$-13");
        arrayList.add("$0");
        arrayList.add("$0");
        System.out.println(getSum(arrayList));
    }
}
