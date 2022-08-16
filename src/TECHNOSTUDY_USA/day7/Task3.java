package TECHNOSTUDY_USA.day7;

public class Task3 {
    //  Write a Java program to replace all the 'd' characters with 'f' characters
    //      input: The quick brown fox jumps over the lazy dog.
    //      output: The quick brown fox jumps over the lazy fog.
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";
        System.out.println(text.replace('d','f'));

        //    part 2:
        //    replace all the 'a','t','e' characters with 'f'
        //
        //    part 3:
        //    replace all the 'o','q','r' characters with 'L' using regex

        System.out.println(text.
                replaceAll("a", "f")
                .replaceAll("t", "f")
                .replaceAll("e", "f"));

      //  'o','q','r' replace with 'L' using Regex

    }
}
