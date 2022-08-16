package TECHNOSTUDY_ISMETBY.Gun48_49Inheritance.Extends6.pak2;

import TECHNOSTUDY_ISMETBY.Gun48_49Inheritance.Extends6.pak1.pak1Hayvan;

public class pak2Main {
    public static void main(String[] args) {

        pak1Hayvan hayvan2 = new pak1Hayvan();
        hayvan2.ad = "köpek"; // public olduğundan her yerden ulaşılabiliyor.
        //hayvan2.yas =8 ; // default olunca sadece kendi paketinden ulaşılabilir.
        // farklı paketten ulaşılamaz.
        //hayvan2.cinsi="van"; // default gibi çalışıyor normal classlarda
        // sadece kendi paketinden ulaşılabilir.
        //hayvan2.renk ="beyaz"; // bu filed private olduğundan sadece kendi
        // clasının içinden ulaşılabilir.


        pak2Kedi kedi = new pak2Kedi("köpük", "tekir");
        kedi.BilgiYaz();
        //kedi.cinsi Sadece subclass dan ulaşılabiliyor.

    }

}



