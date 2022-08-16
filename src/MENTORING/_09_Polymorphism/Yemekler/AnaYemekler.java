package MENTORING._09_Polymorphism.Yemekler;

public class AnaYemekler extends yemekler {
    public AnaYemekler(String isim) {
        super(isim);
    }

    @Override
    public String siparis() {
        return getIsim() + " alabilirmiyim?";
    }
}
