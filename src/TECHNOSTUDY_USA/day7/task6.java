package TECHNOSTUDY_USA.day7;

public class task6 {
    //Given two strings, a and b,
    // return the result of putting them together in the order bbaa,
    //
    // e.g. "Hi" and "Bye" returns "ByeByeHiHi".

    public static void main(String[] args) {
        /*
        String a = "Hi";
        String b = "Bye";
        String m=b+b+a+a;
        System.out.println(m);
        */

        //part 2, use .concat method instead of +
        String a = "Hi";
        String b = "Bye";

        System.out.println(b.concat(b)+a.concat(a));

        //part 3, use scanner to provide input strings

    }
}
