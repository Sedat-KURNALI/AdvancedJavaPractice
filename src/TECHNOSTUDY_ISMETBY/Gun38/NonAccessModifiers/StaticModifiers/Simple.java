package TECHNOSTUDY_ISMETBY.Gun38.NonAccessModifiers.StaticModifiers;

public class Simple {

    int a;        // oluşturulacak her bir nesnenin kendi değişkeni
    static int b; // bu static anahtarı ile sınıfın bir değişkeni oluyor.

    void increase() {
        a++;
        b++;
    }

    public static void main(String[] args) {
        Simple ornek1 = new Simple();
        ornek1.a = 5;

        Simple ornek2 = new Simple();
        ornek2.a = 7;

        Simple.b = 5;  // b değeri sınıfa ait olduğundan 1 tanedir ve değer atandıkça değişir.
        Simple.b = 7;

        ornek1.increase(); // ornek1.a 1 arttı,  sınıfn da b si 1 arttı
        ornek2.increase(); // ornek2.a 1 arttı, sınıf da b si 1 arttı

        System.out.println("ornek1.a = " + ornek1.a); // ornek1.a = 6
        System.out.println("ornek2.a = " + ornek2.a); // ornek2.a = 8
        System.out.println("Simple.b = " + Simple.b); // Simple.b = 9

    }
}

