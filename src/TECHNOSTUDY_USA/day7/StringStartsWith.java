package TECHNOSTUDY_USA.day7;

public class StringStartsWith {
    /*
     startsWith()

     Checks whether a string starts with specified characters

     boolean
     */
    public static void main(String[] args) {
        String text = "Hello world";
        System.out.println("is text starts with Hello: "+text.startsWith(("Hello"))); //true
        System.out.println("is text starts with Hello: "+text.startsWith(("hello"))); //false
        System.out.println("is text starts with Hello: "+text.startsWith(("worl"))); //false

    }
}
