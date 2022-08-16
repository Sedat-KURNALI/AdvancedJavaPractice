package TECHNOSTUDY_USA.day99.Replit.ReplitMethod;

public class ReplitMethod11 {
    /*
    Create one method name is  addDigits

Taking int as a parameter.

 Return type is also int


Given a positive integer num, repeatedly add all its digits until the result has only one digit.
Example:
Input: 38
Output: 2
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
             Since 2 has only one digit, return it.
     */
    /*
    public static int addDigits (int num){
        // 38
        String sDigits = String.valueOf(num);
        int length = sDigits.length();
        int [] digits = new int [];

    }

     */

    /*
    public int addDigits(int num){
        while ( num%10!=num ){
            num = num/10 + num%10;
        }
        return num;
    }

     */
    public static int addDigits(int a){ //123

        int sum=0;

        char[] digits = String.valueOf(a).toCharArray(); // '1''2''3'

        for (char each: digits){

            sum += Integer.parseInt(""+each);
        }
        if(sum>10) { // to reduce 1 digit
            do {
                digits = String.valueOf(sum).toCharArray();
                sum = 0;
                for (char each : digits) {
                    sum += Integer.parseInt("" + each);
                }

            } while (sum > 10);
        }
        return sum;
    }

}
