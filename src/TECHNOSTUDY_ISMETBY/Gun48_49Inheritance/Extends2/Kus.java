package TECHNOSTUDY_ISMETBY.Gun48_49Inheritance.Extends2;

public class Kus extends Hayvan {
    public Kus(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        System.out.println("öttü...");
    }
}
