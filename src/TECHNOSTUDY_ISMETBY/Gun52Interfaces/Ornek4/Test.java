package TECHNOSTUDY_ISMETBY.Gun52Interfaces.Ornek4;

public class Test implements IYazdir, IGoster {
    @Override
    public void goster() {
        System.out.println("göster ");
    }

    // implemente edilen interfaceler de aynı isim ve paramatrede
    // olan metdolardan bir tane yazmak yeterlidir,
    // problem oluşturmaz.
    @Override
    public void yazdir() {
        System.out.println("yaz...");

    }
}
