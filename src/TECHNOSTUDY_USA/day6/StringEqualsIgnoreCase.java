package TECHNOSTUDY_USA.day6;

public class StringEqualsIgnoreCase {

    public static void main(String[] args) {
        String t1 = "Hello";
        String t2 = "Bonjour";

        // System.out.println(t1.equals(t2)); // out: false
        // System.out.println(t1.equals("hello")); //out: false
        System.out.println(t1.equalsIgnoreCase("hello")); // out: true
    }
}