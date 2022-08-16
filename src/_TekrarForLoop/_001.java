package _TekrarForLoop;

public class _001 {
    public static void main(String[] args) {
       /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)
        Scanner scan = new Scanner(System.in);
         */

        String input = "Bugün hava oldukca güzel.";
        int sayac = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'c') {
                break;
            } else if (input.charAt(i) == 'a') {
                sayac++;
            }
        }
        System.out.println(input + "->" + sayac);


    }

}
