package TECHNOSTUDY_USA.day6;

public class StringSubstring {
/*
Extracts the characters from a string, beginning at a specified start
position, and through the specified number of character
 */
public static void main(String[] args) {

    String text = "Hello World";
    String res = text.substring (6,10);
    System.out.println(res);

    String res2 = text.substring(6);
    System.out.println(res2);

    String res3 = text.substring(0);
    System.out.println(res3);



}

}
