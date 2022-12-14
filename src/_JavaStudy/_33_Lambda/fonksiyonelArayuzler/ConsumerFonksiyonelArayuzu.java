package _JavaStudy._33_Lambda.fonksiyonelArayuzler;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFonksiyonelArayuzu {
    public static void main(String[] args) {
        List<Kisi> kisilerListesi = new ArrayList<Kisi>();
        kisilerListesi.add(new Kisi("Ali", 27));
        kisilerListesi.add(new Kisi("Veli", 26));
        kisilerListesi.add(new Kisi("Can", 28));

        kisilerListesi.forEach((k) -> {
            System.out.println(" Kişi Adı   : " + k.getIsim());
            System.out.println(" Kişi Yaşı  : " + k.getYas());
        });

        // 2.Örnek
        Consumer<Kisi> consumer = (k) -> {
            System.out.println(k.getIsim());
            System.out.println(k.getYas());
        };
        consumer.accept(new Kisi("Ayşe", 22));
        consumer.accept(new Kisi("Mehmet",45));
    }
}

