package TECHNOSTUDY_ISMETBY.Gun46_47Encapsulation.Ex2;

public class ArabaMain {
    public static void main(String[] args) {

        Araba honda = new Araba();

        honda.setRenk("kırmızı");
        honda.setModel("civic");
        honda.setMotor(1600);
        honda.setKapiSayisi(2);

        Araba volvo = new Araba("beyaz", "xc60", 2000, 4);
        Araba toyota = new Araba("gri", "avensis", 1600, 10);
        System.out.println("toyota.getKapiSayisi() = " + toyota.getKapiSayisi());


    }
}