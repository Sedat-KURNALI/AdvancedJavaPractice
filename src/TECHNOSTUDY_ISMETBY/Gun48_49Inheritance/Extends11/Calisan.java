package TECHNOSTUDY_ISMETBY.Gun48_49Inheritance.Extends11;

public class Calisan extends Kisi {

    private String departman;

    public Calisan(String ad, String soyad, String gorevi, String departman) {
        super(ad, soyad, gorevi);
        this.departman = departman;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    @Override
    public void bilgileriYaz() {
        super.bilgileriYaz();
        System.out.println("Departman: " + getDepartman());
    }
}
