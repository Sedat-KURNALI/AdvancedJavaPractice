package TECHNOSTUDY_USA.example;

public class splitExample {
    public static void main(String[] args) {
        String text = "$12 $23 $10 $2 $5 $2";
        String[] words = text.split(" ");
        int[] numbers = new int[words.length];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.valueOf(words[i].substring(1));
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
