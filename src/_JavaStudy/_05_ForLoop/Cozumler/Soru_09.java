package _JavaStudy._05_ForLoop.Cozumler;

public class Soru_09 {
    /*
     ***********
      *********
       *******
        *****
         ***
          *
         ***
        *****
       *******
      *********
     ***********

     şekli yazdırınız
     */
    public static void main(String[] args) {

        for (int i = 6; i > 0; i--) {

            for (int j = 0; j < 6 - i; j++) {//bosluklar
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i - 1; k++) {//yıldız
                System.out.print("*");
            }

            System.out.println();
      }
        for ( int i = 1; i < 7; i++) {

            for (int j = 7 - i; j > 1; j--) {//bosluklari
                System.out.print(" ");
            }

            for (int k = 2 * i - 1; k > 0; k--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    /*
     //TODO Write program that prints this using loops
        // *********** => satır =1 iken => 0b 11y
        //  *********  => satır =2 iken => 1b 9y
        //   *******   => satır =3 iken => 2b 7y
        //    *****    => satır =4 iken => 3b 5y
        //     ***     => satır =5 iken => 4b 3y
        //      *      => satır =6 iken => 5b 1y
        //  6 satır
        // 1 tane satır döngüsü,  sütunlar:  1 tane boşluk döngüsü, 1 tane yıldız döngüsü

        for (int satir = 1; satir <= 6; satir++) // satır kontrol döngüsü
        {
            for (int bosluk = 0; bosluk < satir - 1; bosluk++) { // boşluk atan döngü , her satıra göre
                System.out.print(" ");
            }

            for (int yildiz = 13 - (satir * 2); yildiz > 0; yildiz--) { // yıldız atan dönü her satıra göre
                System.out.print("*");
            }

            System.out.println();
     */
}


