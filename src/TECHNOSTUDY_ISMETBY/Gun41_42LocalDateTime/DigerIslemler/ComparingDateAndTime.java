package TECHNOSTUDY_ISMETBY.Gun41_42LocalDateTime.DigerIslemler;

import java.time.LocalDate;

public class ComparingDateAndTime {
    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        LocalDate dun = bugun.minusDays(1);

        boolean after = bugun.isAfter(dun);// bugun dünden sonra mı? true.
        System.out.println("after = " + after);

        boolean before = bugun.isBefore(dun);//bugun dünden önce mi? false.
        System.out.println("before = " + before);

        boolean equal = bugun.isEqual(dun); //bugun düne eşit mi? false.
        System.out.println("equal = " + equal);

        boolean leapyear = bugun.isLeapYear();// Artık yıl mı? false.

        int fark = bugun.compareTo(dun);// iki tarih arasındaki farkın en  üyük parçası arasındaki farkı verir.
        System.out.println("fark = " + fark);//dün ile bugun arasındaki fark =1,


           /*     ComperaTo komutu işlevi:
        2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
        2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
        2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için    */
    }
}
