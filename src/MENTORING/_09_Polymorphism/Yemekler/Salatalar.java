package MENTORING._09_Polymorphism.Yemekler;

public class Salatalar extends yemekler {
    public Salatalar(String isim) {
        super(isim);
    }

    @Override
    public String siparis() {
        return getClass().getSimpleName() + "dan " + getIsim() + " alabilirmiyim?";
    }
}
