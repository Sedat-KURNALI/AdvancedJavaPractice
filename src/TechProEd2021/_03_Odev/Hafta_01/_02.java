package TechProEd2021._03_Odev.Hafta_01;

import java.util.Scanner;

public class _02{

        /*
    Kullaniciya gunde kac cay ictigini ve cayi kac sekerli ictigini sorun.
    Daha sonra kullanicinin yilda kac kg seker kullandigini hesaplayan java kodunu yaziniz.
    1 seker= 1.7 gr
    Ornek: Input ⇒
    Cay : 10
    Seker :2
    Output : 12.41 kg/yil
*/
        public static void main(String[] args) {

            Scanner oku = new Scanner(System.in);
            System.out.println("Lütfen günde kaç bardak çay içtiğinizi giriniz : ");
            int bardakSayisi = oku.nextInt();
            System.out.println("Çayı kaç şekerli içersiniz : ");
            int sekerMiktari = oku.nextInt();
            int yil = 365;
            double seker = 1.7;
            double yillikSekerTuketimi = (double) (yil * bardakSayisi * sekerMiktari * seker);
            System.out.println("Bir yılda toplam " + (yillikSekerTuketimi / 1000) + " kg şeker tüketiyorsunuz");

        }
}


