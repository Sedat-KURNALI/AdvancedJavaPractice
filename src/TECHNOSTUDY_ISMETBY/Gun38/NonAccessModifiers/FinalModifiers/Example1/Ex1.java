package TECHNOSTUDY_ISMETBY.Gun38.NonAccessModifiers.FinalModifiers.Example1;

public class Ex1 {
    public static void main(String[] args) {
        // Bir dairenin alanı=pi*r*r

        int yaricap = 4;
        double alan = 4 * 4 * Constants.pi;

        int gun = 23;
        int saat = 7;
        int dakika = 25;

        // verilen saat,dakika, ve gün bilgisini
        // saniyeye çeviriniz.


        int saniyeCinsinden = gun * Constants.hourInDay * Constants.minuteInHour * Constants.secondInMinute +
                saat * Constants.minuteInHour * Constants.secondInMinute +
                dakika * Constants.secondInMinute;
        System.out.println("sonuc = " + saniyeCinsinden);

    }

}

