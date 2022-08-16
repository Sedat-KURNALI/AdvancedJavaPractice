package TECHNOSTUDY_USA.day19;

public class Task2<toLowerCase> {

    public static void main(String[] args) {

    }
    // create a method which checks if length of string is at least 8 characters
    public static boolean checkLength(String text) {
        return text.length() >= 8;
    }

    // try to ovoid writing redundant code
    public static boolean checkLength2(String text) {
        if(text.length() >= 8){
            return true;
                }else {
            return false;
       }
    }
        // create a method which checks if character is letter
    public static boolean checkCharLetter(char character) {
       //character = Character.toLowerCase(character)
        boolean isLetter = (character >= 'a' && character <= 'z')||(character >= 'A' && character <= 'Z');
        return isLetter;
    }
    // create a method which counts letters in given string
    // create a method which checks if character is digit
    // create a method which counts digits in given string




    //    Write a Java method to check whether a string is a valid password.
    //    Password rules:
    //    A password must have at least ten characters.
    //    A password consists of only letters and digits.
    //    A password must contain at least two digits.

}