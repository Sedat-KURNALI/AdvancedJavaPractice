package TECHNOSTUDY_ISMETBY.Gun52Interfaces.Ornek2;

public class Grafikler {
    public static void main(String[] args) {
        // bir interface den bir çok class implemente edilebilir
        cember cember = new cember();
        Dikdortgen dd = new Dikdortgen();
        cember.ciz();
        dd.ciz();

        // interface lerden nesne üretilemez fakat referans tipi oluşturulabilir
        // bu bize POLİMORPHİSM sağlar.
        ICizilebilir cember2 = new cember();
        cember.ciz();
    }
}
