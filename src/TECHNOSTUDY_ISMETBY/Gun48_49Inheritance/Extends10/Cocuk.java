package TECHNOSTUDY_ISMETBY.Gun48_49Inheritance.Extends10;

public class Cocuk extends Baba {

    boolean bisiklet;

    public Cocuk() {

    }

    public Cocuk(String isim) {
        super(isim);
    }

    @Override
    public String toString() {
        return "Cocuk{" +
                "bisiklet=" + bisiklet +
                ", boy=" + boy +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                '}';
    }
}
