package MENTORING._09_Polymorphism.Yemekler;

public class siparisler {
    public static void main(String[] args) {

        yemekler anaYemekler = new AnaYemekler("ozbek pilavi");
        System.out.println(anaYemekler.siparis());

        yemekler salatalar = new Salatalar("gavurdagi sallatasi");
        System.out.println(salatalar.siparis());

        yemekler tatlilar = new Tatlilar("dondurmali kunefe");
        System.out.println(tatlilar.siparis());
    }
}
