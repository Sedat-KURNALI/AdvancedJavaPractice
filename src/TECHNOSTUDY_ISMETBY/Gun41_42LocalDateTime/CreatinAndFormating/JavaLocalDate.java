package TECHNOSTUDY_ISMETBY.Gun41_42LocalDateTime.CreatinAndFormating;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class JavaLocalDate {
    public static void main(String[] args) {
        // Sadece gün, ay, yıldan oluşan tarih tutar, saat,dk,sn tutmaz, doğum tarihi 27.01.2000
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2019, 7, 20);
        LocalDate date3 = LocalDate.of(2019, Month.JULY, 20);

        System.out.println("date1.getYear() = " + date1.getYear());
        System.out.println("date1.getMounth() = " + date1.getMonth());
        System.out.println("date1.getMounthValue() = " + date1.getMonthValue());
        System.out.println("date1.getDayofWeek() = " + date1.getDayOfWeek());
        System.out.println("date1.getDayofMounth() = " + date1.getDayOfMonth());
        System.out.println("date1.getDayofYear() = " + date1.getDayOfYear());

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("date1.format(format1 = " + date1.format(format1));
        System.out.println("SHORT date = " + date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM date = " + date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG date = " + date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL Date = " + date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));
        // yukarıda lokalizasyon yaptık

        // Sistemde kullanılabilir lokalleri aşağıdaki kod ile aldık, norveç için if e bağladık
        Locale[] kullanilabilirLokaller = Locale.getAvailableLocales();

        for (Locale l : kullanilabilirLokaller) {
            if (l.getDisplayCountry().toLowerCase().contains("nor"))
                System.out.println("l = " + l + " " + l.getDisplayCountry());
        }

        // Aşağıda Norveçe göre , lokalizasyon sonucunda göre var zamanın Norveç dilindeki gösterimi oldu.
        Locale localeNorvec = new Locale("no", "NO");
        System.out.println("FULL Date Norveç = " + date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(localeNorvec)));
    }
}
