package TECHNOSTUDY_USA.day99.Replit.ReplitMethod;

public class ReplitMethod10 {
    /*
    Create one method name is fib ***

This method will accept one int ***

return should be int. ***

The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), for N > 1.

Given N, calculate F(N).
Example 1:
Input: 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

Example 2:
Input: 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.

Example 3:
Input: 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
     */
    public static int fib (int a){
        if (a==1 || a==2){
            return 1;
        }
        int t1 = 1;
        int t2 = 1;
        int tg = 1;
/*
         1  1  2  3  5  8  13
   i=3   t1 t2 tg
   i=4      t1 t2 tg
   i=5         t1 t2 tg
  */
        for (int i = 3; i <=a ; i++) { //i=5  =2 3 5
            tg = t1 + t2; //5
            t1 = t2; //2
            t2 = tg; //3
        }
     return tg;
    }

    /*
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int e = 10;


        System.out.println(fib(a));
        System.out.println(fib(b));
        System.out.println(fib(c));
        System.out.println(fib(d));
        System.out.println(fib(e));



    }

     */
}
