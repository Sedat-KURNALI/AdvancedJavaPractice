package TECHNOSTUDY_ISMETBY.Gun41_42LocalDateTime.CreatinAndFormating;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaLocalTime {
    public static void main(String[] args) {

        //Tarih içermez sadece  saat, dakika, saniye içerir, 9:00 am gibi.
        LocalTime time1 = LocalTime.now();  // o andaki zamanı verir

        LocalTime time2 = LocalTime.of(21, 12);
        LocalTime time3 = LocalTime.of(21, 12, 45);

        System.out.println("time1.getHour() = " + time1.getHour());
        System.out.println("time1.getMinute() = " + time1.getMinute());
        System.out.println("time1.getSecond() = " + time1.getSecond());
        System.out.println("time1.getNano() = " + time1.getNano());

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("hh:mm:ss a");// a: am,pm karşılığı lokalizasyon TR oluğu için ÖÖ,ÖS
        System.out.println("time1.format(format1) = " + time1.format(format1));

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("hh:mm:ss ");
        System.out.println("time2.format(format2) = " + time2.format(format2));

        System.out.println("time1 = " + time1);
        LocalTime time4 = LocalTime.now();
        System.out.println("time4 = " + time4);

    }
}
