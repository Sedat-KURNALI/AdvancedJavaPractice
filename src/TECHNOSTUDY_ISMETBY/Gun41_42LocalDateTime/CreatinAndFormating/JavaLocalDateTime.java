package TECHNOSTUDY_ISMETBY.Gun41_42LocalDateTime.CreatinAndFormating;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaLocalDateTime {
    public static void main(String[] args) {

        //Tarih ve saat bilgisini tutar,
        LocalDateTime dt = LocalDateTime.now();

        LocalDate d = LocalDate.of(2020, 3, 17);
        LocalTime t = LocalTime.of(22, 3, 12);
        LocalDateTime dt1 = LocalDateTime.of(d, t);

        LocalDateTime dt2 = LocalDateTime.of(2021, 1, 2, 3, 5, 45);

        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt.getMonth() = " + dt.getMonth());
        System.out.println("dt.getMonthValue() = " + dt.getMonthValue());
        System.out.println("dt.getDayOfMonth() = " + dt.getDayOfMonth());
        System.out.println("dt.getHour() = " + dt.getHour());
        System.out.println("dt.getMinute() = " + dt.getMinute());

    }
}
