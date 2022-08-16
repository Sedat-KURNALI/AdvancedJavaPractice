package TECHNOSTUDY_USA.example;

public class JavaSplitExample {
    public static void main(String[] args) {
        String text="Hello World";
        String [] letters=text.split("");
        for (int i=letters.length-1;i>=0;i--){
            System.out.print(letters[i]);
        }
    }
}
