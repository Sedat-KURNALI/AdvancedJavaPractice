package TECHNOSTUDY_ISMETBY.Gun48_49Inheritance.Extends6.pak2;

import TECHNOSTUDY_ISMETBY.Gun48_49Inheritance.Extends6.pak1.pak1Hayvan;

public class pak2Kedi extends pak1Hayvan {

    public pak2Kedi(String ad, String cinsi) {
        super.ad = ad;
        super.cinsi = cinsi;
    }

    public void BilgiYaz() {
        System.out.println("super.ad = " + super.ad);
        System.out.println("super.cinsi = " + super.cinsi);
    }

}
