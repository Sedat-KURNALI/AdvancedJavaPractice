package TECHNOSTUDY_USA.day8;

public class JavaArithmeticOperators3 {

    public static void main(String[] args) {
/*
    ++
    ++x; x++;
    Pre Increment; Post Increment
    int x = 1;
    print(++x); -> 2   |  print(x++); -> 1


    --
    --y; y--;
    Pre decrement; Post decrement
    int x = 1;
    print(--x); -> 0  |  print(x++); -> 1
     */
/*
        int a = 10;
        a++; // a = a+1
        System.out.println("after increment: "+ a);

        int b = 5;
        System.out.println("post increment b: " + (b++) ); //post increment effect in next line or usage after this line
        System.out.println("second usage of b: " + b );

        //pre increment
        int c = 3;
        System.out.println("pre increment c: " + (++c));
        System.out.println("second usage of c: " + c );
*/
/*
    ++
    ++x; x++;
    Pre Increment; Post Increment
    int x = 1;
    print(++x); -> 2   |  print(x++); -> 1


    --
    --y; y--;
    Pre decrement; Post decrement
    int x = 1;
    print(--x); -> 0  |  print(x++); -> 1
     */

            int x;
            int y;

            // Increment operators
            // Pre-increment - x is incremented by 1, then y is assigned the value of x
            x = 1;
            y = ++x;    // x is now 2, y is also 2
            System.out.println( "\nPre-increment: x=" + x + " y=" + y );

            // Post-increment - y is assigned the value of x, then x is incremented by 1
            x = 1;
            y = x++;    // x is now 2, y is 1
            System.out.println( "\nPost-increment: x=" + x + " y=" + y );


            //-------------------------------------------------------------------------
            // Decrement operators
            // Pre-decrement - x is decremented by 1, then y is assigned the value of x
            x = 1;
            y = --x;    // x is now 0, y is also 0
            System.out.println( "\n\nPre-decrement: x=" + x + " y=" + y );


            // Post-decrement - y is assigned the value of x, then x is decremented by 1
            x = 1;
            y = x--;    // x is now 0, y is 1
            System.out.println( "\nPost-decrement: x=" + x + " y=" + y );
    }
}
