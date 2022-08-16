package TECHNOSTUDY_USA.day11;

public class Task5 {
    public static void main(String[] args) {
        // Write a Java program to check whether a character is alphabet or not.
        // use just lowercase letters, a to z
        // hint: char is also numeric
        // ex1:  h => it is alphabet character
        // ex2: 10 => it is not in alphabet
char letter ='%';

// elvis
        // a 97 z 122
        boolean isAlphabet = letter >= 'a' && letter <= 'z';
        System.out.println(isAlphabet ? "it is alphabet character" : "it is not in alphabet");
    }
}
