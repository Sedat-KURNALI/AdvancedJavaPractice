package MENTORING._09_Polymorphism.Yemekler;

public class Tatlilar extends yemekler {
    public Tatlilar(String isim) {
        super(isim);
    }

    @Override
    public String siparis() {
        return getIsim() + " alabilirmiyim?";
    }
}
