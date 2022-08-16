package TECHNOSTUDY_ISMETBY.Gun53AbstractClass.Ornek2;

public class Dikdortgen extends Sekil {
    private double uzunluk;
    private double genislik;

    // bu bölüm boş contructor ı işaret ediyor
    // yazılmasa da extend de olduğu için, burda da
    // contructor var ise mutlaka kullanılması gerekiyor,
    // boş olan için yazılmasa da olur, ancak super class
    // da bunun karşılığı olmak zorunda.

    public Dikdortgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    public double alan() {
        return this.uzunluk * this.genislik;
    }

    @Override
    public double cevre() {
        return (this.uzunluk + this.genislik) * 2;
    }
}
