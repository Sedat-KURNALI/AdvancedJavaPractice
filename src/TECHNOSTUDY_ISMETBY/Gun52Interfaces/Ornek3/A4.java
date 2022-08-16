package TECHNOSTUDY_ISMETBY.Gun52Interfaces.Ornek3;


//birden fazla interface den implemente edilebilir.
public class A4 implements IYazdirilabilir, IGosterilebilir {
    @Override
    public void goster() {
        System.out.println("gösterildi..");

    }

    @Override
    public void yazdir() {
        System.out.println("yazdırıldı...");

    }
}
