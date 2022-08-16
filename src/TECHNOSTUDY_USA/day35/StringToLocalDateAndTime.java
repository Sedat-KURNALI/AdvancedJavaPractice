package TECHNOSTUDY_USA.day35;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StringToLocalDateAndTime {

    public static void main(String[] args) {
        String strDate = "01-25-2020";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");

        LocalDate localDate = LocalDate.parse(strDate, formatter);
        System.out.println(localDate);

        System.out.println("MM dd yyyy: "+localDate.format(DateTimeFormatter.ofPattern("MM dd yyyy")));

        String strTime = "12:49";
        LocalTime localTime = LocalTime.parse(strTime);

        System.out.println("mm:HH ->" +localTime.format(DateTimeFormatter.ofPattern("mm:HH")));

    }
}