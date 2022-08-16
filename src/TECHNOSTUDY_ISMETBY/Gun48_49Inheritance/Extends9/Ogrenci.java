package TECHNOSTUDY_ISMETBY.Gun48_49Inheritance.Extends9;

public class Ogrenci extends kisi {
    private double OkulUcret;

    public Ogrenci(String isim, String adres, Okul okul, UyeTipi uyeTipi, double OkulUcret) {
        super(isim, adres, okul, uyeTipi);
        setOkulUcret(OkulUcret);
    }

    public double getOkulUcret() {
        return OkulUcret;
    }

    public void setOkulUcret(double okulUcret) {
        OkulUcret = okulUcret;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getOkulUcret();
    }
}
