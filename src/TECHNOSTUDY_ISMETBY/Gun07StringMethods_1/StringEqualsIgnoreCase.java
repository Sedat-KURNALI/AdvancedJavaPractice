package TECHNOSTUDY_ISMETBY.Gun07StringMethods_1;

public class StringEqualsIgnoreCase {
    public static void main(String[] args) {
        // 2 stringi büyük küçük karakter ayırımı yapmadan karşılaştırır
        // sonuç boolean değişkenidir.

        String str = "Merhaba";

        System.out.println("Eşit mi = " + str.equalsIgnoreCase("mERHaba")); // true
        System.out.println("Eşit mi = " + str.equalsIgnoreCase("mERHa"));

        boolean esitMi = str.equalsIgnoreCase("mERHaba");
        // boolean değişkenine atanabilir , kontrol sonucu
    }
}
