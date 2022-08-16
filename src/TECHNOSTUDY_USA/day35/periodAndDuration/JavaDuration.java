package TECHNOSTUDY_USA.day35.periodAndDuration;

import java.time.Duration;
import java.time.LocalTime;

public class JavaDuration {

    public static void main(String[] args) {
        LocalTime midnight = LocalTime.of(0, 0);
        LocalTime onePM = LocalTime.of(13, 0);

        Duration between = Duration.between(midnight, onePM);
        long seconds = between.getSeconds();
        System.out.println(seconds);

        Duration durationJavaCourse = Duration.ofHours(3);
        Duration halfAnHour = Duration.ofMinutes(33);
        Duration raceTimeinSeconds = Duration.ofSeconds(12345);

        LocalTime startOfJavaCourse = LocalTime.of(10, 00);
        LocalTime endOfJavaCourse = startOfJavaCourse.plus(durationJavaCourse);
        LocalTime endOfJavaCourse1 = startOfJavaCourse.minus(durationJavaCourse);

        LocalTime now = LocalTime.now();
        System.out.println(now.plus(durationJavaCourse));
        System.out.println(now.minus(durationJavaCourse));
        System.out.println(now.plus(raceTimeinSeconds));
        System.out.println(now.minus(raceTimeinSeconds));


    }
}