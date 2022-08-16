package TECHNOSTUDY_ISMETBY.Gun41_42LocalDateTime.DigerIslemler;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StringToLocalDateAndTime {
    public static void main(String[] args) {

        String strDate = "01 25 2020";

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM dd yyyy"); // String değeri tarihe çevirmek için format belirledik.Stringin formatı bu formata uygun olmalı.parse ile çevirdik.
        LocalDate tarih = LocalDate.parse(strDate, format);

        System.out.println("tarih = " + tarih);

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM.dd.yyyy"); // Ekrana yazdırma formatı belirledik.istediğimiz formatla yazdırdık
        System.out.println("tarih.format(format1) = " + tarih.format(format1));

        String strTime = "12:49";
        LocalTime time = LocalTime.parse(strTime);  // parse ile string olan zaman bilgisi, LocalTime tipi gerçek zaman değişkenine  çevirdik.
        System.out.println("time = " + time);
    }
}
