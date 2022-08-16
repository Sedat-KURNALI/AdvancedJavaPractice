package TECHNOSTUDY_USA.day99.RCalismalar;

public class TryCatch4 {



    public static String getCharacter(String str1, int num) {
        try {

            return Character.toString(str1.charAt(num));
        }catch (Exception e){
            return "Invalid number!!!";
        }

    }

    /*
    Create method name is getCharacter()
Parameter is one String str1 and one int num
Return type is String
Get the char in the position of num from the str1
if the num is bigger then str1 length then return Invalid number!!!
NOTE: Do not use if statement use try catch block
     */
}


//nndvvndv() throws Exception

   // throw new Exception
