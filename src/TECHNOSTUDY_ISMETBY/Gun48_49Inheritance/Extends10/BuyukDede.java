package TECHNOSTUDY_ISMETBY.Gun48_49Inheritance.Extends10;

public class BuyukDede {
    String isim;
    String soyisim;
    int yas;
    String meslek;
    boolean tatlisever;

    public BuyukDede() {
    }

    public BuyukDede(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "BuyukDede{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                ", meslek='" + meslek + '\'' +
                ", tatlisever=" + tatlisever +
                '}';
    }
}
