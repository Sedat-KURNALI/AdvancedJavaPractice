package TECHNOSTUDY_USA.day6;

public class StringCharAt {
    public static void main(String[] args) {
    /*
    charAt()
    Returns the character at the specified index (position)
    */
    String text = "Google";
        System.out.println(text.charAt(5));

        // System.out.println(text.charAt(100));
       /* Error is like that
       Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 100
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
	at java.base/java.lang.String.charAt(String.java:711)
	at day6.StringCharAt.main(StringCharAt.java:11)
        */
    }
}
