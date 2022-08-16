package TECHNOSTUDY_USA.day99.RCalismalar;

public class TryCatch5 {

    public static String getChar(String str1, int num){
        try{
            return Character.toString(str1.charAt(num));
        }catch (Exception e) {
            return "String can not be null";
        }
    }


    /*
    Create a method name is getChar()
Parameter is one string and one int
return type is String
Get the char in the position of num from the str1
if the String is null
return String can not be null
 NOTE: Do not use if statement use try catch block
     */
}
