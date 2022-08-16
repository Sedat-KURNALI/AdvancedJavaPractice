package TECHNOSTUDY_USA.day7;

public class StringEndsWith { //BuradaKaldik
    /*
    Checks whether a string ends with the specified character(s)
     */
    public static void main(String[] args) {
        String text = "Hello world";
        System.out.println("is text starts with Hello: "+text.endsWith(("Hello"))); //false
        System.out.println("is text starts with Hello: "+text.endsWith(("hello"))); //false
        System.out.println("is text starts with Hello: "+text.endsWith(("worl"))); //false
        System.out.println("is text starts with Hello: "+text.endsWith(("world"))); //true
    }
}
