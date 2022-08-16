package TECHNOSTUDY_USA.day13;

public class Task3 {
    public static void main(String[] args) {
        // Write a java program which prints alphabet
        // constraints: lowercase letters
        // abcde...z
        char alph = 'a'; // 97 -122 (a == 97)

        while (alph<='z') {

            System.out.print(alph);
            alph++;
        }
    }
}
