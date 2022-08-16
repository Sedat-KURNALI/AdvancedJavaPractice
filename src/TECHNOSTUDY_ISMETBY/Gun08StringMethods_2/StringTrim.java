package TECHNOSTUDY_ISMETBY.Gun08StringMethods_2;

public class StringTrim {
    public static void main(String[] args) {
        // trim : stringin başında ve sonunda olan boşluk karakterlerini temizler

        String text = "   Merhaba  Dünya   ";

        System.out.println("orjinal hali = ->" + text + "<-");
        System.out.println("baş ve sondaki boşlukların temizlenmiş hali = ->" + text.trim() + "<-");
    }
}
