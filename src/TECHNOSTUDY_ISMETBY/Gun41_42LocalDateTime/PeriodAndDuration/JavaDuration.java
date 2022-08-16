package TECHNOSTUDY_ISMETBY.Gun41_42LocalDateTime.PeriodAndDuration;

import java.time.Duration;
import java.time.LocalTime;

public class JavaDuration {
    public static void main(String[] args) {

        LocalTime geceYarisi = LocalTime.of(0, 0);
        LocalTime ogleVakti = LocalTime.of(13, 3, 2, 5);

        Duration fark = Duration.between(geceYarisi, ogleVakti);

        System.out.println("fark = " + fark);
        System.out.println("fark.toMillis() = " + fark.toMillis());

        System.out.println("fark.toHours() = " + fark.toHours());
        System.out.println("fark.toMinutes() = " + fark.toMinutes());
        System.out.println("fark.toDays() = " + fark.toDays());

        System.out.println("fark.toHoursPart() = " + fark.toHours());
        System.out.println("fark.toMinutesPart() = " + fark.toMinutes());
        System.out.println("fark.toSecondsPart() = " + fark.toNanos());
        System.out.println("fark.toMillisPart() = " + fark.toMillis());
    }
}