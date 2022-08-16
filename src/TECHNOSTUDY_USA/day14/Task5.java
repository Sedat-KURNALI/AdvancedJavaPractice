package TECHNOSTUDY_USA.day14;

public class Task5 {
    // Given a string print every character in new line
            //01234
    // str = "Hello"
           // length = 5
    // H
    // e
    // l
    // l
    // o
    public static void main(String[] args) {
        String str = "Hello";
        int len = str.length();
        for(int index = 0; index < len; index++){
            char c = str.charAt(index);
            System.out.println(c);
        }
        // if(char c = str.charAt(0)=='a');
    }
}
