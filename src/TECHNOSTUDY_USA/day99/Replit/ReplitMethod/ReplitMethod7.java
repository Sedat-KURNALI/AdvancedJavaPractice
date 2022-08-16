package TECHNOSTUDY_USA.day99.Replit.ReplitMethod;

public class ReplitMethod7 {
    /*
    Create one method name is plusOne ***
    This method takes parameter as int array ***

    In this array actually you have the digits of a positive number
    and you number's first digit can not be 0, except  your number 0 itself .
    You are expected to add 1 to the middle digit. // 01 0 pozitif

    Returns type will be int array  ***
    Example 1:
    Input: [1,2,3]
    Output: [1,3,3]
    Explanation: The array represents the integer 133.
        Example 2:
    Input: [4,3,5,2,1]
    Output: [4,3,6,2,1]
    Explanation: The array represents the integer 43621.
     */
    public static int[] plusOne (int [] a){

        int arrLength = a.length;
        double middle =0;
        //int middleIndex = (int) Math.ceil(a.length / 2);

        if (arrLength % 2 != 0) {
            middle = (arrLength+1)/2.0 -1;
        }else {
            middle = (arrLength)/2.0 -1;
        }
        int intMiddle = (int) Integer.valueOf ((int) middle);

        a[intMiddle] += 1;

        return a;
    }

    public static void main(String[] args) {
        int [] a = {1, 2, 3};
        int [] b = {4,3,5,2,1};
        plusOne(a);
        System.out.println(plusOne(a));
    }
}
