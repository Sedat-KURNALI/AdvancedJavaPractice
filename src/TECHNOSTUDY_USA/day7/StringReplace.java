package TECHNOSTUDY_USA.day7;

public class StringReplace {
    /*
    Searches a string for a specified value, and returns a new string where the specified values are replaced
     */
    /*
    public class StringReplace {
    /*
     replace()

     Searches a string for a specified value,
     and returns a new string where the specified values are replaced

     String
     */
/*
    public static void main(String[] args) {

        String text = "Hello World!!!";

        System.out.println(text.replace( "Hello","Hi" ));
     */

    public static void main(String[] args) {

        String text = "Hello World!!!";

        System.out.println(
                text
                        .replace("Hello", "Hi")
                        .replace("World", "everybody")

        );
        String text1 = "Hello World Hello!!!";
        System.out.println(text1.replace("Hello", "Hi"));



    }
}
