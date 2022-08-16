package _JavaStudy._12_Encapsulation.Ex1;

public class KisiMain {
    public static void main(String[] args) {
        Kisi kisi1=new Kisi(); //Kisi classından kisi1 obj ürettik

        kisi1.adi ="haluk";
        kisi1.soyadi ="bilgin";//kisi1 obj tüm fieldlerine direk ulaşabildik.
        kisi1.setYas(-46);//yas field private oldğ için bu veriyi setYas methodu ile giriş yaptık
        // Kullanıcı hatalı veri girmesini engellemek için veiable erişime kapatılmalı.
        System.out.println("kisi1.getYas() = " + kisi1.getYas());//46
    }
}
