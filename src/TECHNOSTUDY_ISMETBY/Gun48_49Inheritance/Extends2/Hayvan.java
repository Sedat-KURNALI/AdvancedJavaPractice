package TECHNOSTUDY_ISMETBY.Gun48_49Inheritance.Extends2;

public class Hayvan {
    // Hayvan sınıfı superclass olmak üzere köpek,
    // kedi ve kuş sınıfları üreteceğiz.
    String renk;
    int kilo;
    String cinsi;

    public void konustu() {
        System.out.println("konuştu..");
    }

    public void yemekYer() {
        System.out.println("Yemek yer..");
    }

    public Hayvan(String renk, int kilo, String cinsi) {
        this.renk = renk;
        this.kilo = kilo;
        this.cinsi = cinsi;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

}

