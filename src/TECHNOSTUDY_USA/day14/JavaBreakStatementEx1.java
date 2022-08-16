package TECHNOSTUDY_USA.day14;

public class JavaBreakStatementEx1 {

    public static void main(String[] args) {

        String text = "Stay at home";

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter == ' ') {
                break;
            }
            System.out.println(letter);
        }
        System.out.println("end of code");
    }
}
