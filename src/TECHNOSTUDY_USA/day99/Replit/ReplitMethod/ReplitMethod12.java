package TECHNOSTUDY_USA.day99.Replit.ReplitMethod;

public class ReplitMethod12 {
    /*
    create a method name is powerOfThree

parameter is one int

return type is boolean


Given an integer, write a function to determine if it is a power of three.
Example 1:
Input: 27
Output: true

Explanation: 3*3*3 =27
result = true

Example 2:
Input: 0
Output: false
Example 3:
Input: 9
Output: true
Explanation: 3*3 = 9
result = true


Example 4:
Input: 45
Output: false
Explanation: 3*3*3*3 =81
result = false

45 is not power of 3
     */
    /*
    public static boolean powerOfThree (int a){
boolean result = false;
        if ( a % 3 == 0 ){
            result = true;
            break;
        }else if (a==0 || a % 3 == 1 || a % 3 == 2 ){
            result = false;
        }
        return result;
    } //12.03
*/
    public static void main(String[] args) {
        int a = 0;
        int b = 4;
        int c = 45;
        System.out.println(powerOfThree(c));
        System.out.println( );
    }


    public static boolean powerOfThree(int x) {
        boolean result = false;
        while (x % 3 == 0) {
            x = x / 3;
            if (x == 1)
                result = true;
            else
                result = false;
        }
        return result;
    }

/*
    public static boolean powerOfThree(int num) {
        boolean result = false;

        for (int i = 0; i < 10; i++) {
            if (Math.pow(3, i) == num) {
                result = true;
                break;
            }
        }
        return result;
    }
 */

}
