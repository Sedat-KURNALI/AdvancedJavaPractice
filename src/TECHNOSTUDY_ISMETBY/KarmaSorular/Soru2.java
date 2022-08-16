package TECHNOSTUDY_ISMETBY.KarmaSorular;

public class Soru2 {
    public static void main(String[] args) {

        try {
            System.out.println("LINE A");
            System.out.println("LINE B");
            System.out.println("LINE C");
            System.out.println("LINE D");
        } catch (Exception e) {
            System.out.println("LINE E");
            System.out.println("LINE F");
        }
        System.out.println("LINE G");

    }
    // try içinde hata yakalamayacağı için try bloğu ve catch dışındaki G çıktısı alınır.


}
