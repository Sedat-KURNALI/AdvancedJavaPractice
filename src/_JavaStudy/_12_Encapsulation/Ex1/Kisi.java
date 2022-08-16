package _JavaStudy._12_Encapsulation.Ex1;

public class Kisi {
    //instance veriable attirubute property field
    String adi;
    String soyadi;
    private int yas;

    //private değişkene ulaşmak için method yazılmalı
    //setter method : veriable daki veriyi update eder değiştirir.bu metod parametreli olmalı
    public void setYas(int yas) {
        if (yas>0) {//- değer girme kontrolu yapıldı.
        this.yas = yas;//parametre olarak girilen yas değerini instance veriable yasa ata
        }else this.yas=-yas;
       // 2. yol this.yas=Math.abs(yas); yası math clasından mutlak değer nmetoduna attık
    }

    //getter Method : veriable daki veriyi getirir.bu method parametresiz olmalı
    public int getYas(){
        return this.yas;
    }
}





